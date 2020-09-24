package com.kgc.teackingmgt.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kgc.teackingmgt.dto.common.ResultDto;
import com.kgc.teackingmgt.dto.common.ResultUtil;
import com.kgc.teackingmgt.dto.vo.MenuFirstVo;
import com.kgc.teackingmgt.dto.webObj.LoginForm;
import com.kgc.teackingmgt.entity.Users;
import com.kgc.teackingmgt.service.UsersService;
import com.kgc.teackingmgt.utils.EmptyUtils;
import com.kgc.teackingmgt.utils.MD5;
import com.kgc.teackingmgt.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class UserController {
    wwwwww
    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private UsersService usersService;

    @PostMapping("/login")
    public ResultDto login(@RequestBody LoginForm loginForm){


        //先查数据库
        Users userDB=usersService.getUserByPhone(loginForm.getPhone());
        if (!EmptyUtils.isEmpty(userDB)){
            //手机号正确
            if (userDB.getPassword().equals(loginForm.getPassword())){
                //生成一个token
                String token=generateToken(userDB);
                //存到redis
                saveToken(token,userDB);
                //封装用户信息
                String userJson=JSON.toJSONString(userDB);

                return ResultUtil.returnSuccess(token,userJson);

            }else {
                return ResultUtil.returnFailed(403,"wrong password");
            }

        }else{
            //没查到
            return ResultUtil.returnFailed(403,"wrong phone");
        }

    }



    @GetMapping("/queryMenus")
    public ResultDto queryMenus(HttpServletRequest request){
        String token = request.getHeader("auth");
        //根据token获得用户信息
        String userJson=(String) redisUtils.get(token);
        Users user=JSON.parseObject(userJson,Users.class);
//        System.out.println(users);
        //根据用户信息，获得菜单列表
        List<MenuFirstVo> menuFirstVoList=
                usersService.queryMenuListByRole(user.getRoleid());

        return ResultUtil.returnDataSuccess(menuFirstVoList);
    }


    @GetMapping("/queryTeachers")
    public ResultDto queryTeachers(String query, int pageNum, int pageSize){

        List<Users> teachers = usersService.getTeachersQueryPage(query,pageNum,pageSize);
        int total = usersService.getTeachersQuerySize(query);

        Map<String,Object> result = new HashMap<>();
        result.put("teacherList",teachers);
        result.put("total",total);

        return ResultUtil.returnDataSuccess(result);

    }


    private String generateToken(Users user) {
        StringBuilder sb = new StringBuilder();
        sb.append("token-");
        sb.append("PC-" + "-");
        String info = MD5.getMd5(user.getUserphone(), 32);
        sb.append(info + "-");
        sb.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "-");
        sb.append(UUID.randomUUID().toString().substring(0, 6));
        return sb.toString();
    }

    private void saveToken(String token,Users user){

        String tokenKey = "TOKEN:"+user.getUserid();
        String tokenValue=null;

        if ((tokenValue=(String)redisUtils.get(tokenKey))!=null){
            redisUtils.delete(tokenKey);
            redisUtils.delete(tokenValue);
        }
        //缓存token信息
        redisUtils.set(tokenKey,60,token);
        //缓存用户详细信息
        redisUtils.set(token,60,JSON.toJSONString(user));
    }


}

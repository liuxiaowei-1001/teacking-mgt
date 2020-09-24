package com.kgc.teackingmgt.service.impl;

import com.kgc.teackingmgt.dao.RightsDao;
import com.kgc.teackingmgt.dao.UsersDao;
import com.kgc.teackingmgt.dto.vo.MenuFirstVo;
import com.kgc.teackingmgt.dto.vo.MenuSecondVo;
import com.kgc.teackingmgt.entity.Rights;
import com.kgc.teackingmgt.entity.Users;
import com.kgc.teackingmgt.service.UsersService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2020-09-17 11:50:39
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;

    @Resource
    private RightsDao rightsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public Users queryById(Integer userid) {
        return this.usersDao.queryById(userid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Users> queryAllByLimit(int offset, int limit) {
        return this.usersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users insert(Users users) {
        this.usersDao.insert(users);
        return users;
    }

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users update(Users users) {
        this.usersDao.update(users);
        return this.queryById(users.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userid) {
        return this.usersDao.deleteById(userid) > 0;
    }


    @Override
    public List<Users> queryAll(Users user) {
        return usersDao.queryAll(user);
    }

    @Override
    public Users getUserByPhone(String phone) {
        return usersDao.getUserByPhone(phone);
    }

    @Override
    public List<MenuFirstVo> queryMenuListByRole(int roleid) {

        //根据roleid，查出这个权限所有的一级菜单
        List<MenuFirstVo> menuFirstVoList =
                rightsDao.getMenuFirstList(roleid);
//        System.out.println(menuFirstVoList);
        //循环每个一级菜单，查下级菜单中，属于这个权限的
        for (MenuFirstVo firstVo:menuFirstVoList){
            List<MenuSecondVo> menuSecondVoList=
                    rightsDao.getMenuSecondList(roleid,
                            firstVo.getRightid());
//            System.out.println(menuSecondVoList);
            firstVo.setChildren(menuSecondVoList);
        }

        return menuFirstVoList;
    }

    @Override
    public List<Users> getTeachersQueryPage(String query, int pageNum, int size) {
        int index = (pageNum-1)*size;
        return usersDao.getTeachersQueryPage(query, index, size);
    }

    @Override
    public int getTeachersQuerySize(String query) {
        return usersDao.getTeachersQuerySize(query);
    }
}

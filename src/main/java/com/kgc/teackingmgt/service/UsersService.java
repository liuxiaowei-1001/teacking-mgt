package com.kgc.teackingmgt.service;

import com.kgc.teackingmgt.dto.vo.MenuFirstVo;
import com.kgc.teackingmgt.entity.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2020-09-17 11:50:39
 */
public interface UsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Users queryById(Integer userid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Users> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userid);


    List<Users> queryAll(Users user);


    Users getUserByPhone(String phone);

    List<MenuFirstVo> queryMenuListByRole(int roleid);

    List<Users> getTeachersQueryPage(String query,int pageNum,int size);

    int getTeachersQuerySize(String query);
}
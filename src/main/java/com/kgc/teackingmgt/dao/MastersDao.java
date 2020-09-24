package com.kgc.teackingmgt.dao;

import com.kgc.teackingmgt.entity.Masters;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Masters)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-17 11:48:01
 */
public interface MastersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param masterid 主键
     * @return 实例对象
     */
    Masters queryById(Integer masterid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Masters> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param masters 实例对象
     * @return 对象列表
     */
    List<Masters> queryAll(Masters masters);

    /**
     * 新增数据
     *
     * @param masters 实例对象
     * @return 影响行数
     */
    int insert(Masters masters);

    /**
     * 修改数据
     *
     * @param masters 实例对象
     * @return 影响行数
     */
    int update(Masters masters);

    /**
     * 通过主键删除数据
     *
     * @param masterid 主键
     * @return 影响行数
     */
    int deleteById(Integer masterid);

}
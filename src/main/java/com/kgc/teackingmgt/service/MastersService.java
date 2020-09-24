package com.kgc.teackingmgt.service;

import com.kgc.teackingmgt.entity.Masters;

import java.util.List;

/**
 * (Masters)表服务接口
 *
 * @author makejava
 * @since 2020-09-17 11:48:02
 */
public interface MastersService {

    /**
     * 通过ID查询单条数据
     *
     * @param masterid 主键
     * @return 实例对象
     */
    Masters queryById(Integer masterid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Masters> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param masters 实例对象
     * @return 实例对象
     */
    Masters insert(Masters masters);

    /**
     * 修改数据
     *
     * @param masters 实例对象
     * @return 实例对象
     */
    Masters update(Masters masters);

    /**
     * 通过主键删除数据
     *
     * @param masterid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer masterid);

}
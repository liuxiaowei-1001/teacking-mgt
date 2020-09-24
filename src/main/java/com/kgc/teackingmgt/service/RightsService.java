package com.kgc.teackingmgt.service;

import com.kgc.teackingmgt.entity.Rights;

import java.util.List;

/**
 * (Rights)表服务接口
 *
 * @author makejava
 * @since 2020-09-17 11:48:06
 */
public interface RightsService {

    /**
     * 通过ID查询单条数据
     *
     * @param rightid 主键
     * @return 实例对象
     */
    Rights queryById(Integer rightid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Rights> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rights 实例对象
     * @return 实例对象
     */
    Rights insert(Rights rights);

    /**
     * 修改数据
     *
     * @param rights 实例对象
     * @return 实例对象
     */
    Rights update(Rights rights);

    /**
     * 通过主键删除数据
     *
     * @param rightid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rightid);

}
package com.kgc.teackingmgt.service.impl;

import com.kgc.teackingmgt.dao.MastersDao;
import com.kgc.teackingmgt.entity.Masters;
import com.kgc.teackingmgt.service.MastersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Masters)表服务实现类
 *
 * @author makejava
 * @since 2020-09-17 11:48:04
 */
@Service("mastersService")
public class MastersServiceImpl implements MastersService {
    @Resource
    private MastersDao mastersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param masterid 主键
     * @return 实例对象
     */
    @Override
    public Masters queryById(Integer masterid) {
        return this.mastersDao.queryById(masterid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Masters> queryAllByLimit(int offset, int limit) {
        return this.mastersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param masters 实例对象
     * @return 实例对象
     */
    @Override
    public Masters insert(Masters masters) {
        this.mastersDao.insert(masters);
        return masters;
    }

    /**
     * 修改数据
     *
     * @param masters 实例对象
     * @return 实例对象
     */
    @Override
    public Masters update(Masters masters) {
        this.mastersDao.update(masters);
        return this.queryById(masters.getMasterid());
    }

    /**
     * 通过主键删除数据
     *
     * @param masterid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer masterid) {
        return this.mastersDao.deleteById(masterid) > 0;
    }
}
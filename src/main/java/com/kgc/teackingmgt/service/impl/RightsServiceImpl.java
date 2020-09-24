package com.kgc.teackingmgt.service.impl;

import com.kgc.teackingmgt.dao.RightsDao;
import com.kgc.teackingmgt.entity.Rights;
import com.kgc.teackingmgt.service.RightsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Rights)表服务实现类
 *
 * @author makejava
 * @since 2020-09-17 11:48:06
 */
@Service("rightsService")
public class RightsServiceImpl implements RightsService {
    @Resource
    private RightsDao rightsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rightid 主键
     * @return 实例对象
     */
    @Override
    public Rights queryById(Integer rightid) {
        return this.rightsDao.queryById(rightid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Rights> queryAllByLimit(int offset, int limit) {
        return this.rightsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rights 实例对象
     * @return 实例对象
     */
    @Override
    public Rights insert(Rights rights) {
        this.rightsDao.insert(rights);
        return rights;
    }

    /**
     * 修改数据
     *
     * @param rights 实例对象
     * @return 实例对象
     */
    @Override
    public Rights update(Rights rights) {
        this.rightsDao.update(rights);
        return this.queryById(rights.getRightid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rightid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rightid) {
        return this.rightsDao.deleteById(rightid) > 0;
    }
}
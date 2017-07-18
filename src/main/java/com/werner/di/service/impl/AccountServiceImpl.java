package com.werner.di.service.impl;

import com.werner.di.dao.BaseDao;
import com.werner.di.entity.Hotel;
import com.werner.di.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ┌─┐       ┌─┐ + +
 * ┌──┘ ┴───────┘ ┴──┐++
 * │                 │
 * │       ───       │++ + + +
 * ███████───███████ │+
 * │                 │+
 * │       ─┴─       │
 * │                 │
 * └───┐         ┌───┘
 * │         │
 * │         │   + +
 * │         │
 * │         └──────────────┐
 * │                        │
 * │                        ├─┐
 * │                        ┌─┘
 * │                        │
 * └─┐  ┐  ┌───────┬──┐  ┌──┘  + + + +
 * │ ─┤ ─┤       │ ─┤ ─┤
 * └──┴──┘       └──┴──┘  + + + +
 * 神兽保佑
 * 代码无BUG!
 * Spring 注解
 * JSR-255
 * <p>
 * 类注解
 *
 * @Compent
 * @Repository dao
 * @Service
 * @Controller 依赖注入
 * @auto
 * @Resource accountServiceImpl
 */

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {
    //跟name  等同      @Autowired @Resource
    BaseDao<Hotel> dao;

    @Autowired
    public void setDao(BaseDao<Hotel> dao) {
        this.dao = dao;
    }

    @Override
    public void saveHotels(List<Hotel> hotles) {
        int i = dao.saveList(hotles);
    }

    @Override
    public List<Hotel> findAll(int page, int pageSize) {
        return null;
    }
}

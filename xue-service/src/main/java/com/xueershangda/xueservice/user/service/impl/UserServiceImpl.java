package com.xueershangda.xueservice.user.service.impl;

import com.vteba.common.service.impl.BasicServiceImpl;
import com.vteba.tx.dao.spi.BasicDao;
import com.xueershangda.tianxun.user.model.User;
import com.xueershangda.tianxun.user.service.UserService;
import com.xueershangda.xueservice.user.dao.UserDao;

import javax.inject.Inject;
import java.util.List;

/**
 * 基于thrift rpc的用户服务实现。方法签名的throws可以覆盖，不抛出。
 * 有些方法要实现，有些不需要实现，是因为thrift.thrift定义文件很久了，和service不匹配。
 *
 * @author yinlei
 * @since 2018/9/7 17:13
 */
public class UserServiceImpl extends BasicServiceImpl<User, String> implements UserService.Iface {

    private UserDao userDao;

    @Inject
    @Override
    public void setBasicDao(BasicDao<User, String> userDao) {
        this.basicDao = userDao;
        this.userDao = (UserDao) userDao;
    }

    @Override
    public int deleteBatch(User params) {
        return 0;
    }

    @Override
    public List<User> queryForList(User params) {
        return userDao.pagedList(params);
    }

    @Override
    public List<User> queryForPage(User params) {
        return userDao.pageForList(params);
    }

    @Override
    public User find(String id) {
        return null;
    }

    @Override
    public int updateBatch(User record, User params) {
        return 0;
    }
}

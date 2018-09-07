package com.xueershangda.xueservice.user.service.impl;

import com.vteba.common.service.impl.BasicServiceImpl;
import com.vteba.tx.dao.spi.BasicDao;
import com.xueershangda.tianxun.user.model.User;
import com.xueershangda.tianxun.user.service.UserService;
import com.xueershangda.xueservice.user.dao.UserDao;

import javax.inject.Inject;
import java.util.List;

/**
 *
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
        return null;
    }

    @Override
    public List<User> queryForPage(User params) {
        return null;
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

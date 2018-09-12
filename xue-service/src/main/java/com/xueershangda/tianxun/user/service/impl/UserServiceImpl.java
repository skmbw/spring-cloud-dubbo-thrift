package com.xueershangda.tianxun.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.vteba.common.service.impl.BasicServiceImpl;
import com.vteba.tx.dao.spi.BasicDao;
import com.vteba.utils.reflection.BeanUtils;
import com.xueershangda.tianxun.user.dao.UserDao;
import com.xueershangda.tianxun.user.model.User;
import com.xueershangda.tianxun.user.model.UserProtobuf;
import com.xueershangda.tianxun.user.service.UserProtobufService;
import lombok.extern.log4j.Log4j2;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 基于thrift rpc的用户服务实现。方法签名的throws可以覆盖，不抛出。
 * 有些方法要实现，有些不需要实现，是因为thrift.thrift定义文件很久了，和service不匹配。
 *
 * @author yinlei
 * @since 2018/9/7 17:13
 */
@Log4j2
@Service
public class UserServiceImpl extends BasicServiceImpl<User, String> implements UserProtobufService {

    private UserDao userDao;

    @Inject
    @Override
    public void setBasicDao(BasicDao<User, String> userDao) {
        this.basicDao = userDao;
        this.userDao = (UserDao) userDao;
    }

//    @Override
//    public int deleteBatch(User params) {
//        return 0;
//    }
//
//    @Override
//    public List<User> queryForList(User params) {
//        return userDao.pagedList(params);
//    }
//
//    @Override
//    public List<User> queryForPage(User params) {
//        return userDao.pageForList(params);
//    }
//
//    @Override
//    public User find(String id) {
//        User user = new User();
//        user = userDao.get(id);
//        return user;
//    }
//
//    @Override
//    public int updateBatch(User record, User params) {
//        return 0;
//    }

    @Override
    public UserProtobuf getUser(String id) {
        User user = get(id);
        UserProtobuf protobuf = new UserProtobuf();
        BeanUtils.copy(user, protobuf);
        return protobuf;
    }

    @Override
    public List<UserProtobuf> list(UserProtobuf user) {
        UserProtobuf protobuf = new UserProtobuf();
        protobuf.setAccount("yinlei");
        protobuf.setAge(22);
        protobuf.setBirthday(new Date().getTime());
        List<UserProtobuf> list = new ArrayList<>();
        list.add(protobuf);
        return list;
    }

    @Override
    public Long testLonger(Long l) {
        return l + 22;
    }

    @Override
    public long testLong(long l) {
        return l + 23;
    }

    @Override
    public int testInt(int l) {
        return l + 26;
    }

    @Override
    public Integer testInteger(Integer l) {
        return l + 27;
    }

    @Override
    public String testString(String s) {
        return s + "aa啊啊";
    }

    @Override
    public String testTwoParam(String s, Integer i) {
        return s + i;
    }
}

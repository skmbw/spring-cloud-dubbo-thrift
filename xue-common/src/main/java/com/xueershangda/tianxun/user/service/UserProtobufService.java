package com.xueershangda.tianxun.user.service;

import com.xueershangda.tianxun.user.model.UserProtobuf;

import java.util.List;

/**
 * @author yinlei
 * @since 2018/9/11 15:04
 */
public interface UserProtobufService {
    UserProtobuf getUser(String id);
    List<UserProtobuf> list(UserProtobuf user);
    Long testLonger(Long l);
    long testLong(long l);
    int testInt(int l);
    Integer testInteger(Integer l);
    String testString(String s);
    String testTwoParam(String s, Integer i);
}

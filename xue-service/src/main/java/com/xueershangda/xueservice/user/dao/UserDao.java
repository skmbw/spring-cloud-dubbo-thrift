package com.xueershangda.xueservice.user.dao;

import com.vteba.tx.dao.spi.BasicDao;
import com.xueershangda.tianxun.user.model.User;

import java.util.List;

/**
 * 用户表（user）的 MyBatis DAO Mapper。<br>
 * 该类由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。如果修改请确保正确。
 *
 * @author yinlei
 * @since 2016-03-24 20:14:14
 */
public interface UserDao extends BasicDao<User, String> {

    /**
     * 分页查询用户，order by栏位写死
     *
     * @param user 参数
     * @return 查询结果list
     */
    List<User> pageForList(User user);

    /**
     * 根据帐号或者手机号码查询用户是否存在
     *
     * @param user 参数，含account和mobile
     * @return 已存在的用户LIST
     */
    List<User> checkUserExist(User user);
}
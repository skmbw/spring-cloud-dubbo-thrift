package com.xueershangda.xueapi.user.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xueershangda.tianxun.user.model.User;
import com.xueershangda.tianxun.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户控制器
 *
 * @author yinlei
 * @since 18-9-8 下午4:05
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    private static final Logger LOGGER = LogManager.getLogger(UserAction.class);

    @Reference
    private UserService.Iface userService;

    @RequestMapping("/list")
    public String list() {
        try {
            User user = userService.find("1608101744241981");
            LOGGER.info(user);
        } catch (TException e) {
            e.printStackTrace();
        }
        return "111";
    }
}

package com.xueershangda.xueapi.user.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xueershangda.tianxun.user.service.UserService;
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
    @Reference
    private UserService.Client userService;

    @RequestMapping("/list")
    public String list() {
        return null;
    }
}

package com.xueershangda.xueapi.user.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xueershangda.tianxun.user.model.UserProtobuf;
import com.xueershangda.tianxun.user.service.UserProtobufService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    private UserProtobufService userService;
//    private UserService.Iface userService;

    @ResponseBody
    @RequestMapping("/list")
    public String list() {
        try {
//            UserProtobuf user = userService.getUser("1608101744241981");
            UserProtobuf protobuf = new UserProtobuf();
            protobuf.setBirthday(12112L);
            protobuf.setAge(22);
            protobuf.setAvatar("/dadfa/jp.jpg");
            List<UserProtobuf> list = userService.list(protobuf);
            LOGGER.info("list end");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "111";
    }
}

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
            // 传参：writeObject(String)->writeUTF；接参：readObject(Class<T> cls)(String)；
            // 发送：writeObject(UserProtobuf)；接收：readObject(Class<T> cls, Type type)
            UserProtobuf user = userService.getUser("1608101744241981");
            UserProtobuf protobuf = new UserProtobuf();
            protobuf.setBirthday(12112L);
            protobuf.setAge(22);
            protobuf.setAvatar("/dadfa/jp.jpg");
            // 传参：writeObject(UserProtobuf)；接参：readObject(Class<T> cls)(UserProtobuf)；
            // 发送：writeObject(List)；接收：readObject(Class<T> cls, Type type)(List<UserProtobuf>)
            List<UserProtobuf> list = userService.list(protobuf);

            // 传参：writeObject(Number)->writeInt；接参：readObject(Class<T> cls)(int)；
            // 发送：writeObject(Number)->writeInt；接收：readObject(Class<T> cls)(int)
            int i = userService.testInt(22);
            // 传参：writeObject(Number)->writeInt；接参：readObject(Class<T> cls)(Integer)；
            // 发送：writeObject(Number)->writeInt；接收：readObject(Class<T> cls, Type type)(Integer)
            Integer i2 = userService.testInteger(23);
            // 传参：writeObject(Number)->writeLong；接参：readObject(Class<T> cls)(long)；
            // 发送：writeObject(Number)->writeLong；接收：readObject(Class<T> cls)(long)
            long l = userService.testLong(26);
            // 传参：writeObject(Number)->writeLong；接参：readObject(Class<T> cls)(Long)；
            // 发送：writeObject(Number)->writeLong；接收：readObject(Class<T> cls, Type type)(Long)
            Long ll = userService.testLonger(27L);
            // 传参：writeObject(String)->writeUTF；接参：readObject(Class<T> cls)(String)；
            // 发送：writeObject(String)->writeUTF；接收：readObject(Class<T> cls, Type type)(String)
            String s = userService.testString("gagalll");
            // 传参：writeObject(String)->writeUTF,writeObject(Number)->writeInt；接参：readObject(Class<T> cls)(String),readObject(Class<T> cls)(Integer)；
            // 发送：writeObject(String)->writeUTF；接收：readObject(Class<T> cls, Type type)(String)
            String ss = userService.testTwoParam("gagalll", 28);

            LOGGER.info("list end");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "111";
    }
}

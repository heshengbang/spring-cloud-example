package com.hsb.spring.boot.web;

import com.hsb.spring.boot.sender.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/13 14:01
 */
@RestController
public class UserController {
    @Autowired
    private UserSender userSender;

    /**
     * 实体类传输测试
     */
    @RequestMapping("/user")
    public void userTest() {
        userSender.send();
    }
}

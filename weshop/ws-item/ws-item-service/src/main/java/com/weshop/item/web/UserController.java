package com.weshop.item.web;

import com.weshop.item.pojo.User;
import com.weshop.item.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.item.web
 * 2019/7/27
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "post")
    public User saveUser(User user) {
        return userService.SaveUser(user);
    }
}

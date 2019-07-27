package com.weshop.item.service;

import com.weshop.item.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.item.service
 * 2019/7/27
 */
@Service
public class UserService {
    /**
     * 新增用户信息
     *
     * @param user
     * @return
     */
    public User SaveUser(User user){
        user.setId(user.getId());
        user.setName(user.getName());
        user.setAge(user.getAge());
        user.setSex(user.getSex());
        user.setTelphone(user.getTelphone());
        user.setRegisterMode(user.getRegisterMode());
        user.setThirdPatryId(user.getThirdPatryId());
        return user;

    }
}

package com.bjpowernode.mulitdatasources.service.impl;

import com.bjpowernode.mulitdatasources.model.User;
import com.bjpowernode.mulitdatasources.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户实现类
 *
 * @auto admin
 * @data 2019/3/25 17:11
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private com.bjpowernode.mulitdatasources.mapper3307.UserMapper userMapper3307;

    @Resource
    private com.bjpowernode.mulitdatasources.mapper3308.UserMapper userMapper3308;

    @Resource
    private com.bjpowernode.mulitdatasources.mapper3309.UserMapper userMapper3309;

    @Resource
    private com.bjpowernode.mulitdatasources.mapper3310.UserMapper userMapper3310;


    @Override
    public User queryUserById3307(int id) {
        return userMapper3307.selectByPrimaryKey(id);
    }

    @Override
    public User queryUserById3308(int id) {
        return userMapper3308.selectByPrimaryKey(id);
    }

    @Override
    public User queryUserById3309(int id) {
        return userMapper3309.selectByPrimaryKey(id);
    }

    @Override
    public User queryUserById3310(int id) {
        return userMapper3310.selectByPrimaryKey(id);
    }
}

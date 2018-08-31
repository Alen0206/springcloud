package com.tzc.ljq.cloudcore.service.impl;

import com.tzc.ljq.cloudapi.model.User;
import com.tzc.ljq.cloudapi.service.UserService;
import com.tzc.ljq.cloudcore.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujinqi
 * @date 2018/8/31
 */
@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/{id}")
    @Override
    public User getUserById(@PathVariable("id") long id) {
        return userMapper.getUserById(id);
    }
}

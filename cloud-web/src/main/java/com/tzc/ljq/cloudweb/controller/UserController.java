package com.tzc.ljq.cloudweb.controller;

import com.tzc.ljq.cloudapi.model.User;
import com.tzc.ljq.cloudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujinqi
 * @date 2018/8/31
 */
@RestController
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }


}

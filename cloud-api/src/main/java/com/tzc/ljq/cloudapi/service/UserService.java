package com.tzc.ljq.cloudapi.service;

import com.tzc.ljq.cloudapi.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lujinqi
 * @date 2018/8/31
 */
@FeignClient("producer")
public interface UserService {

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") long id);
}

package com.tzc.ljq.cloudapi.model;

import lombok.Data;

/**
 * @author lujinqi
 * @date 2018/8/31
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private int age;
    private String email;
}

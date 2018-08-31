package com.tzc.ljq.cloudcore.mapper;

import com.tzc.ljq.cloudapi.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author lujinqi
 * @date 2018/8/31
 */
@Mapper
@Component
public interface UserMapper {
    /**
     * 根据用户id获取用户信息
     * @param id
     * @return
     */
    User getUserById(long id);
}

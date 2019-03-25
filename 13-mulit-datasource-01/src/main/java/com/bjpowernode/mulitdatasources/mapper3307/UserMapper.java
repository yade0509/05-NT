package com.bjpowernode.mulitdatasources.mapper3307;

import com.bjpowernode.mulitdatasources.model.User;
import org.springframework.stereotype.Component;

@Component("userMapper3307")
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
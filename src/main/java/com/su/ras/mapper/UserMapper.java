package com.su.ras.mapper;

import java.util.List;

import com.su.ras.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer useId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer useId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> findList(User record);
}
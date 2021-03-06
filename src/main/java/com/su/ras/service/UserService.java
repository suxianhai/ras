package com.su.ras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.su.ras.mapper.UserMapper;
import com.su.ras.model.User;

@Transactional
@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public int deleteByPrimaryKey(Integer userId){
		return userMapper.deleteByPrimaryKey(userId);
	};

	public int insert(User record){
    	return userMapper.insert(record);
    };

    public int insertSelective(User record){
    	return userMapper.insertSelective(record);
    };

    public User selectByPrimaryKey(Integer userId){
    	return userMapper.selectByPrimaryKey(userId);
    };

    public int updateByPrimaryKeySelective(User record){
    	return userMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(User record){
    	return userMapper.updateByPrimaryKey(record);
    };
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public PageInfo findList(User record,int pageNo,int pageSize){
    	PageHelper.startPage(pageNo,pageSize);
    	List<User> list = userMapper.findList(record);
    	PageInfo page = new PageInfo(list);
    	return page;
    };
}

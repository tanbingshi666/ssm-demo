package com.tan.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tan.ssm.bean.User;
import com.tan.ssm.mapper.UserMapper;
import com.tan.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	public User login(String userName,String userEmail) {
		// TODO Auto-generated method stub
		return userMapper.login(userName,userEmail);
	}

}

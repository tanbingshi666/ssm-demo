package com.tan.ssm.mapper;

import org.apache.ibatis.annotations.Param;

import com.tan.ssm.bean.User;

public interface UserMapper {

	User login(@Param("userName") String userName,
			@Param("userEmail") String userEmail);

	void register(User user);

}

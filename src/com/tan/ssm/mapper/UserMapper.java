package com.tan.ssm.mapper;

import org.apache.ibatis.annotations.Param;

import com.tan.ssm.bean.User;

public interface UserMapper {

	User login(@Param("userName") String userName,
			@Param("passwd") String passwd);

	void register(User user);

}

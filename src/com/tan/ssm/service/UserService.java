package com.tan.ssm.service;

import com.tan.ssm.bean.User;

public interface UserService {

	User login(String userName, String passwd);

	void register(User user);

}

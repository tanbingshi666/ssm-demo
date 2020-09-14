package com.tan.ssm.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tan.ssm.bean.User;
import com.tan.ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "login")
	@ResponseBody
	public User login(@RequestParam("userName") String userName,
			@RequestParam("userEmail") String userEmail) {
		System.out.println(userName + "->" + userEmail);
		User user = userService.login(userName, userEmail);
		System.out.println(user);
		return user;
	}

}

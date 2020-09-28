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

	// http://localhost:8080/ssm-demo/login.do?userName=tan&userEmail=123456789
	@RequestMapping(value = "login.do")
	@ResponseBody
	public User login(@RequestParam("userName") String userName,
			@RequestParam("userEmail") String userEmail) {
		System.out.println(userName + "->" + userEmail);
		User user = userService.login(userName, userEmail);
		System.out.println(user);
		return user;
	}

	@RequestMapping("contact-post.do")
	public String contactPost(String userName, String userEmail,
			String userPhone, String userMsg) {

		User user = new User();
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPhone(userPhone);
		user.setUserMsg(userMsg);

		userService.register(user);
		

		return "forward:index.jsp";

	}

}

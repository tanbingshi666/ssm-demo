package com.tan.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tan.ssm.bean.Movie;
import com.tan.ssm.bean.User;
import com.tan.ssm.service.MovieService;
import com.tan.ssm.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public String login(String userName,String passwd,Model m){
		
		User user = userService.login(userName, passwd);
		if(user != null){
			List<Movie> all = movieService.findAll();
			m.addAttribute("movies", all);
			return "index";
		}else{
			return "forward:index.jsp";
		}
		
	}
	
}

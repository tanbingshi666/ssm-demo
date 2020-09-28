package com.tan.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tan.ssm.bean.Movie;
import com.tan.ssm.mapper.MovieMapper;
import com.tan.ssm.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieMapper movieMapper;

	public List<Movie> findAll() {
		return movieMapper.findAll();
	}

}

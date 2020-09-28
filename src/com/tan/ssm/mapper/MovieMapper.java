package com.tan.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tan.ssm.bean.Movie;
import com.tan.ssm.bean.User;

public interface MovieMapper {

	List<Movie> findAll();


}

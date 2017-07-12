package com.junhun.mapper;

import org.apache.ibatis.annotations.Param;

import com.junhun.domain.User;



public interface UserMapper {

	User login(@Param("username") String username,@Param("password") String password);
	
	
}

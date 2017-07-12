package com.junhun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junhun.domain.User;
import com.junhun.mapper.UserMapper;
import com.junhun.service.Interface.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper usermapper;
	
	@Override
	public User login(String username, String password) {
		User user =this.usermapper.login(username,password);
		return user;
	}

}

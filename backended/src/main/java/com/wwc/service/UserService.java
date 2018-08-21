package com.wwc.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.wwc.dao.UserDao;
import com.wwc.entities.User;

@Service("userService")
public class UserService {

	@Resource
	private UserDao userDao;

	public User selectByName(String userName) {
		return userDao.selectByName(userName);
	}
}

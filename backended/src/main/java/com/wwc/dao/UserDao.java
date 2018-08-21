package com.wwc.dao;

import org.springframework.stereotype.Repository;

import com.wwc.entities.User;

@Repository
public interface UserDao {
	
	public User selectByAccount(String account);
}

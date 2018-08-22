package com.wwc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wwc.entities.User;
import com.wwc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("login")
	@ResponseBody
	public User login(String account, String password) {
		User user = service.selectByAccount(account);
		if(user.getPassword().equals(password)) {
			return user;
		}else {
			return null;
		}
	}

	@RequestMapping("register")
	@ResponseBody
	public ModelAndView register() {
		User user = service.selectByAccount("huhao");
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject(user);
		return mv;
	}
}

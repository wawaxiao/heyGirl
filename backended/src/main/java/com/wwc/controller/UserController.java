package com.wwc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wwc.entities.User;
import com.wwc.service.UserService;

@Controller
public class UserController {
	
	private static Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService service;

	@RequestMapping("login")
	@ResponseBody
	public User login(String account, String password) {
		User user = service.selectByAccount(account);
		if(user.getPassword().equals(password)) {
			log.info("比对密码");
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

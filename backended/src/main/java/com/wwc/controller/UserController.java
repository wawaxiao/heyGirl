package com.wwc.controller;

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
	public ModelAndView login(String account, String password) {
		User user = service.selectByName(account);
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject(user);
		return mv;
	}

	@RequestMapping("register")
	@ResponseBody
	public String register() {
		return null;
	}
}

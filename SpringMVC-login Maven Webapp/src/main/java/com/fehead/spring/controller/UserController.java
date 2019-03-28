package com.fehead.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fehead.spring.entity.User;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	public String Create(Model model){
		return "login";
	}
	
	@RequestMapping("/create")
	public String Success(@ModelAttribute("form")User user,Model model){
		model.addAttribute("user",user);
		return "success";
	}
}

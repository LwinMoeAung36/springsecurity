package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("")
	@ResponseBody
	public String startingPoint() {
		return "Hello";
	}
	@GetMapping("admin")
	@ResponseBody
	public String adminPoint() {
		return "Hello Admin";
	}
	
	@GetMapping("user")
	@ResponseBody
	public String userPoint() {
		return "Hello User";
	}

}

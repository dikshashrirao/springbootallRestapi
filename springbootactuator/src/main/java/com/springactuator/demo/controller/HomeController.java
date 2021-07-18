package com.springactuator.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/user")
	public String prelogin()
	{
		return "login";
	}
}

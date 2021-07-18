package com.springprofiles.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
		@Value(value="${cjc.mesg}")
		private String mesg;
		
		@RequestMapping("/")
		public String messg() {
			System.out.println("in controller");
			return mesg;
		}
	}


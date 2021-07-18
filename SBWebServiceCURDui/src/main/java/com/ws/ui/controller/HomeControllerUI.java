package com.ws.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerUI {
 @RequestMapping("/")
  public String prelogin()
  {
	 return "login";
  }
 @RequestMapping("/register")
 public String register()
 {
	 return "registration";
 }
}

package com.cjc.springboot.mvc.springbootmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springboot.mvc.springbootmvc.model.User;
import com.cjc.springboot.mvc.springbootmvc.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService hs;
  @RequestMapping("/")
 public String prelogin()
  {
   return "login";	
  }
 @RequestMapping("/register")
 public String preregister()
 {
	 return "registration";
 }
 @RequestMapping("/reg")
 public String register(@ModelAttribute User user)
 {
	 hs.save(user);
	 return "login";
 }
 @RequestMapping("/login")
 public String logincheck(@RequestParam("uname") String un,
		 @RequestParam("password") String pass,Model m) 
   {
	 User user= hs.logincheck(un,pass);
	 if(user!=null)
	 {
		Iterable<User>list= hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	 }else
	 {
		 System.out.println("null record found");
		 return "login";
	 }
   }
 
  @RequestMapping("/delete")
  public String deletedata(@ModelAttribute("user") User u,Model m) {
	 hs.deleteData(u);
	 Iterable<User>list= hs.getAllData();
		m.addAttribute("data", list);
		return "success";
 }
  
  @RequestMapping("/edit")
   public String editData(@RequestParam("uid") int uid,Model m)
   {
	  User user=hs.editData(uid);
	  m.addAttribute("data", user);
	  return "edit";
   }
  
  @RequestMapping("/update")
  public String updateData(@ModelAttribute("user") User u,Model m)
  {
	  hs.save(u);
	  Iterable<User>list= hs.getAllData();
		m.addAttribute("data", list);
		return "success";
  }
}

package com.bank.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.model.User;
import com.bank.service.BankServices;

@Controller
public class BankController {

	@Autowired
	BankServices bs;
	
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
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("un") String un,
			@RequestParam("ps") String ps,@ModelAttribute("user") 
	                       User u,Model m) 
	 {
		if(un.equals("bank")&&(ps.equals("bank")))
		{  Iterable<User>list=	bs.showAll();
		   m.addAttribute("data", list);
		   return "success";
	    }
	    if(un.equals(u.getUn())&&(ps.equals(u.getPs())))
		{
	    	User user=bs.showOne(un,ps);
			   m.addAttribute("data", Arrays.asList(user));
			   return "success";	
	    }else
	    	return "login";
	    }
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) 
	 {
		bs.save(u);
		return "login";	
	 }
	@RequestMapping("/delete")
	public String deleteUser(@ModelAttribute("user") User u,Model m) 
	 {
		bs.deleteData(u);
		Iterable<User>list=	bs.showAll();
		   m.addAttribute("data", list);
		   return "success";	
	 }
	@RequestMapping("/edit")
	public String editUser(@RequestParam("uid") int uid,Model m) 
	 {
		User user=	bs.editData(uid);
		m.addAttribute("data", user);
		return "edit";	
	 }
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute("user") User u,Model m) 
	 {
		User user=  bs.saveUpadateuser(u);
		  Iterable<User>list=bs.showAll();
		   m.addAttribute("data", list);
		   return "success";	
	 }
}

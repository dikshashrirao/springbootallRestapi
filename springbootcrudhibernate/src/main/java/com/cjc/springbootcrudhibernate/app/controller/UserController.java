package com.cjc.springbootcrudhibernate.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springbootcrudhibernate.app.model.User;
import com.cjc.springbootcrudhibernate.app.servicei.UserServiceI;

@Controller
public class UserController {
	@Autowired
	UserServiceI usi;
	
	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	@RequestMapping("/register")
	public String preRegister() {
		return "registration";
	}

	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u) {
		usi.saveUser(u);
		return "login";
	}
	@RequestMapping("/login")
	public String getAll(@RequestParam("uname") String uname,@RequestParam("password") String password,Model m) {
		
				System.out.println("not admin");
				 Iterable<User>l=usi.singleUser(uname,password);
			m.addAttribute("data", l);
			return "success";
	}
	@RequestMapping("/delete")
	public String deleteUser(@ModelAttribute User u,Model m) {
		usi.deleteData(u);
		 Iterable<User>l=usi.getAllUser();
		m.addAttribute("data", l);
		return "success";
	}
	@RequestMapping("/edit")
	public String editUser(@ModelAttribute("user") User u,@RequestParam("uid") int uid,Model m) {
		 User user1=usi.editUser(uid);
		m.addAttribute("data", user1);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User u,Model m) {
		usi.updateUser(u);
		Iterable<User>l=usi.getAllUser();
		m.addAttribute("data", l);
		return "success";
	}
}

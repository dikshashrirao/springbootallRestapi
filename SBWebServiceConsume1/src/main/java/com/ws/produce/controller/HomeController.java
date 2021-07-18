package com.ws.produce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ws.produce.model.User;

@RestController
public class HomeController {
 
	 @RequestMapping(value = "/logdata/{un}/{ps}" , method=RequestMethod.GET)
	 public List logincheck(@PathVariable("un") String un,@PathVariable("ps") String ps)
	{
		 //this is web service for produced
		 System.out.println("produced");
		User u=new User();
		u.setUid(1);
		u.setUn("diksha");
		u.setPs("bb");
		User u1=new User();
		u1.setUid(2);
		u1.setUn("sejal");
		u1.setPs("aa");
		List al=new ArrayList<User>();
		al.add(u);
		al.add(u1);
		return al;
		//output
		//http://localhost:8083/logdata/diksha/admin
		//[{"uid":1,"un":"diksha","ps":"bb"},{"uid":2,"un":"sejal","ps":"aa"}]
	}
}

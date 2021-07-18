package com.ws.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ws.curd.model.User;
import com.ws.curd.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
@RequestMapping(value = "/getAllData",method = RequestMethod.GET)
  public Iterable<User> getAllData()
  {
	Iterable<User>list=hs.getAllUser();
	return list;
  }

@RequestMapping(value = "/getData/{un}/{ps}",method=RequestMethod.GET)
  public User getData(@PathVariable("un") String un,@PathVariable("ps") String ps)
  {
	User u=hs.getOneUser(un,ps);
	return u;
  }

@RequestMapping(value = "/regData",method=RequestMethod.POST)
  public String regData(@RequestBody User u)
  {
	hs.saveData(u);
	return "inserted";
	
  }

@RequestMapping(value = "/putData",method=RequestMethod.PUT)
  public String putData(@RequestBody User u)
  {//put is used when you wants to update all fields ,it delete old record and add new updated record
	//if record is not present then it add the record
	hs.saveData(u);
	return "updated by put method";
  }

@RequestMapping(value="/patchData/{uid}",method=RequestMethod.PATCH)
   public String updateData(@PathVariable("uid") int uid,@RequestBody User u)
   {//patch is used for updating minimum record so you hv to write custom query 
	//just for updating minimum record like only update some fields it doesnot delete the record like put method
	hs.updateUserData(u);
	return "updated by patch method";
   }

@RequestMapping(value="/deleteData/{uid}",method=RequestMethod.DELETE)
  public String deleteData(@PathVariable("uid") int uid)
   {
	hs.deleteUserData(uid);
	return "deleted";
   }
}

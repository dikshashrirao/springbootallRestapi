package com.ws.produce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class HomeController {
 @Autowired 
 RestTemplate rt;
 
 @RequestMapping(value = "/log/{un}/{ps}" , method=RequestMethod.GET)
 public List logincheck(@PathVariable("un") String un,@PathVariable("ps") String ps)
 {
	 System.out.println("consume");
	String url="http://localhost:8083/logdata/"+un+"/"+ps+"";
	List list=rt.getForObject(url, List.class);
	return list;
	//output
	 //http://localhost:8082/log/diksha/admin
	//[{"uid":1,"un":"diksha","ps":"bb"},{"uid":2,"un":"sejal","ps":"aa"}]
 }
}

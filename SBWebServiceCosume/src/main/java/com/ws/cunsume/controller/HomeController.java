package com.ws.cunsume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ws.cunsume.model.Student;

@RestController
public class HomeController {
  
	@Autowired 
	RestTemplate rt;
	
	@RequestMapping("/getData")
	public List getConsume() {
		
		String url="http://localhost:8081/getAllData";
		List list=rt.getForObject(url, List.class);
		return list;
		//output
		//http://localhost:8082/getData
		//[{"sid":1,"name":"diksha","addr":"pune"},{"sid":2,"name":"diksha","addr":"pune"}]
		//this list is from 8081 wsappln we consume here
	}
	
	@RequestMapping("/getStudent/{sid}")
	public List getConsume1(@PathVariable("sid") int sid) {
		System.out.println(sid);
		String url="http://localhost:8081/getDataByid/"+sid+"";
		List s=rt.getForObject(url, List.class);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		return s;
	}
	
	@PostMapping("/postData")
	 public Student getRegData(@RequestBody Student s)
	 {
		String url="http://localhost:8081/postDataProd";
		Student s1=rt.postForObject(url, s, Student.class);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		return s1;
		//output
		//http://localhost:8082/postData
		//send one obj from body of postman type=json and send
//		{
//	        "sid":3,
//	        "name":"diksha",
//	        "addr":"pune"
//	    }
		//status 200 ok
	 }
	}


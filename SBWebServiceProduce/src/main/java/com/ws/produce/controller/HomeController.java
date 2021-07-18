package com.ws.produce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.produce.model.Student;

@RestController
public class HomeController {
//this is produce web service 
	
	@RequestMapping("/getAllData")
	public List getAllProduced()
	{
		Student s1=new Student();
		s1.setSid(1);
		s1.setName("diksha");
		s1.setAddr("pune");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setName("sejal");
		s2.setAddr("amt");
		
		List<Student> list=new ArrayList();
		list.add(s1);
		list.add(s2);
		
		return list;
		//output
		//http://localhost:8081/getAllData
		//[{"sid":1,"name":"diksha","addr":"pune"},{"sid":2,"name":"diksha","addr":"pune"}]
	}
	@RequestMapping("/getDataByid/{sid}")
	public List getStudentProduced()
	{
		Student s1=new Student();
		s1.setSid(1);
		s1.setName("diksha");
		s1.setAddr("pune");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setName("sejal");
		s2.setAddr("amt");
		
		List<Student> list=new ArrayList();
		list.add(s1); 
		list.add(s2);
		
		return list;
	}
	@PostMapping("/postDataProd")
	 public Student getRegData(@RequestBody Student s)
	 {
		
		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		return s;
	 }
	
	}

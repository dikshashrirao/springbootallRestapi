package com.ws.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.courses.model.Course;
import com.ws.courses.service.CoursesInterface;

@RestController
public class MyController {
  @Autowired
  CoursesInterface ci;
  //get all courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.ci.getCourses();	
	}
  //get course
   @GetMapping("/course/{id}")
   public Optional<Course> getCourse(@PathVariable("id") int id)
   {
	   return this.ci.getCourse(id);
   }
   //add courses
   @PostMapping("/addcourse")
   public Course addCourse(@RequestBody Course course)
   {
	   return this.ci.addCourse(course);
   }
   //update courses
   @PutMapping("/putcourses")
   public Course updateCourse(@RequestBody Course course)
   {
	   return this.ci.updateCourse(course);
   }
   //delete course
   @DeleteMapping("/deletecourse/{id}")
   public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("id") int id)
   {  
	   try{
		   this.ci.deleteCourse(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	   }catch (Exception e) {
		   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	   
   }
   
}

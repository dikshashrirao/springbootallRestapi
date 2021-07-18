package com.ws.courses.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ws.courses.model.Course;


public interface CoursesInterface {

	public List<Course> getCourses();

	public Optional<Course> getCourse(long id);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long id);

  
}

package com.ws.courses.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.courses.dio.Coursedio;
import com.ws.courses.model.Course;
@Service
public class ServiceImpl implements CoursesInterface {
   @Autowired
	private Coursedio cd;
	@Override
	public List<Course> getCourses() {
		return cd.findAll();
	}

	@Override
	public Optional<Course> getCourse(long id) {
		return cd.findById(id);
	}

	@Override
	public Course addCourse(Course course) {
		return cd.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return cd.save(course);
	}

	@Override
	public void deleteCourse(long id) {
		 cd.deleteById(id);
	}
 
}

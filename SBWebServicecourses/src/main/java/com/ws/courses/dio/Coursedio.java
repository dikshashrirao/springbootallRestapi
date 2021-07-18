package com.ws.courses.dio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.ws.courses.model.Course;
@Repository
public interface Coursedio extends JpaRepository<Course, Long>{


}

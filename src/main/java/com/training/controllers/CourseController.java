package com.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.entities.Course;
import com.training.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable Integer id) {
		return this.courseService.getCourseById(id);
	}
	
	@PostMapping("/add")
	public String addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/update/{id}")
	public String updateCourse(
			@RequestBody Course course,
			@PathVariable Integer id) {
		return this.courseService.updateCourse(id, course);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable Integer id) {
		return this.courseService.deleteCourse(id);
	}
	

}

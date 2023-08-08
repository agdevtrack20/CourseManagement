package com.training.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.entities.Course;

public interface CourseService {
	
	public List<Course>  getCourses();
	public Course getCourseById(int id);
	public String addCourse(Course course);
	public String deleteCourse(int id);
	public String updateCourse(int id,Course course);

}

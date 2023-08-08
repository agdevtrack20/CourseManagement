package com.training.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.entities.Course;


@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> courses = new ArrayList<Course>();
	
	@Override
	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public Course getCourseById(int id) {
		for(Course c:courses) {
			if(c.getId()==id) {
				return c;
			}
		}
		return null;
	}

	@Override
	public String addCourse(Course course) {
		courses.add(course);
		return "added";
	}


	@Override
	public String updateCourse(int id,Course course) {
		for(Course c: courses) {
			if(c.getId()==id) {
				c.setTitle(course.getTitle());
				c.setPrice(course.getPrice());
				return "added";
			}
		}
		return "not added";
	}
	
	
	@Override
	public String deleteCourse(int id) {
		Iterator<Course> itr= courses.iterator();
		while(itr.hasNext()) {
			Course tc = itr.next();
			if(tc.getId()==id) {
				itr.remove();
				return "deleted";
				
			}
		}
		return "course not found ! not able to delete";
	}
	
}

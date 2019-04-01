package com.fehead.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.fehead.mvcdemo.model.Course;

@Service
public interface CourseService {

	Course getCoursebyId(Integer courseId);
	
}

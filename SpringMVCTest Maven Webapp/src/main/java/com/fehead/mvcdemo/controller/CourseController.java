package com.fehead.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fehead.mvcdemo.model.Course;
import com.fehead.mvcdemo.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//处理/courses/view?courseId=123
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewCourse(@RequestParam("courseId") Integer courseId,Model model){
		
		Course course = courseService.getCoursebyId(courseId);
		model.addAttribute(course);//默认名字也为course
		
		return "course_overview";
	}
	
	
}

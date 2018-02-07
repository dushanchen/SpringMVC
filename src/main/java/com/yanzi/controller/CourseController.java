package com.yanzi.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yanzi.bean.Course;
import com.yanzi.sevice.CourseService;

@Controller
public class CourseController {

	@Resource
	private CourseService questionService;
	
	
	@RequestMapping("/addCoursePage")
	public ModelAndView addCoursePage(){
		ModelAndView view = new ModelAndView("addCourse");
		view.addObject("name","maita");
		
		return view;
	}
	
	
	@RequestMapping(value="/addCourse",method=RequestMethod.POST)
	public ModelAndView getIndex(Course course){
		System.out.println(course.toString());
		ModelAndView view = new ModelAndView("addCourse");
		view.addObject("message","add success!");
		questionService.addCourse(course);
		return view;
	}
}

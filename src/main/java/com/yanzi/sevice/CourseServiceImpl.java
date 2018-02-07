package com.yanzi.sevice;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.Course;
import com.yanzi.dao.CourseMapper;
import com.yanzi.sevice.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseMapper courseMapper;
	/**
	 * 添加课程
	 */
	public void addCourse(Course course){
		courseMapper.addCourse(course);
	}
	public void get() {
		System.out.println("hello");
	}
	
}

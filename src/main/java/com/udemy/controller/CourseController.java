package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.entity.Course;
import com.udemy.service.impl.CourseServiceImpl;

@Controller
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	@Qualifier("courseServiceImpl")
	
	private CourseServiceImpl courseService;
	private static final Log LOG = LogFactory.getLog(CourseController.class);
	private static final String COURSES_VIEW = "courses";
	
	@GetMapping("/listcourses")
	public ModelAndView listAllCourses(){
		LOG.info("Call"+"listAllcourses");
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject("course", new Course());
		mav.addObject("courses",courseService.ListAllCourse()); 
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute("course") Course course){
		LOG.info("Call"+"addCourses"+" -- Param" + course.toString());
		courseService.addCourse(course);
		return "redirect:/courses/listcourses";
	}
}

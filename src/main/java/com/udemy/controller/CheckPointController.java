package com.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.service.EjercicioService;

@Controller
@RequestMapping("/ejercicio")
public class CheckPointController {
	public static final String RETORNO = "ejercicio";
	public static final String msj = "mensaje";
	
	@Autowired
	@Qualifier("ejercicioService")
	private EjercicioService ejercicioService;
	
	@RequestMapping("/")
	public RedirectView path1(){
		return new RedirectView("/ejercicio/path2");
	}
	
	@RequestMapping("/path2")
	public ModelAndView path2(){
		ModelAndView mav = new ModelAndView();
		ejercicioService.pruebaServicio();
		mav.setViewName(RETORNO);
		mav.addObject("mensaje", msj);
		return mav;
		
	}
	
	
}

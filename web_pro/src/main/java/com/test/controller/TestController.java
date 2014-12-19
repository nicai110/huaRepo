package com.test.controller;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.TestServiceImpl;

@Controller 
@RequestMapping(value="/test",method=RequestMethod.GET)
public class TestController {
	
	@Autowired
	TestServiceImpl testService;
	
	@RequestMapping(value="/load/{info}")
	public ModelAndView  loadData(@PathVariable String info){
		Logger.getLogger(getClass()).info(info);
		ModelAndView mv = new ModelAndView();  
		ArrayList<String>  al  = testService.load();
		Logger.getLogger(getClass()).info(al.get(0));
		mv.addObject("message", info);   
		mv.setViewName("test/list");  
		return mv;
	}
}

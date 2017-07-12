package com.junhun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class Test {

	@GetMapping("tt")
	public ModelAndView test (){
		ModelAndView md = new ModelAndView("index");
		return md;
	}
	
	@GetMapping("t1")
	public String test1 (){
		return "index";
	}
}

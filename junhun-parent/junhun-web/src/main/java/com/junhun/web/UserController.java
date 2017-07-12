package com.junhun.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.junhun.domain.User;
import com.junhun.service.Interface.IUserService;





@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("tologin")
	public ModelAndView toLogin(){
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@PostMapping("login")
	public ModelAndView login(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = this.userService.login(username,password);
		ModelAndView model = new ModelAndView("login");
			model.addObject("msg", "登录成功");
		if(user == null){
			model.addObject("msg", "登录失败");
		}
		return model;
		
	}
}

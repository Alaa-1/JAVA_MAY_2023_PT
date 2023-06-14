package com.alaa.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {
	
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		
		String name = "Jane";
		model.addAttribute("username", name);
		
		session.setAttribute("first_name", name);
//		session.setAttribute("number", 35);
		return "index.jsp";
	}
	
	@RequestMapping("/hello")
	public String hello(HttpSession sesh) {
		String x = (String) sesh.getAttribute("first_name");
		System.out.println(x);
//		int luckyNumber = (int) sesh.getAttribute("number");
		return "greeting/hello.jsp";
	}

}

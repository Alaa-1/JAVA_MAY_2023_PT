package com.alaa.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String displayForm() {
		
		return "form.jsp";
	}
	
//	NEVER EVER RENDER ON POST REQUEST !!!
	@RequestMapping(value="/processForm", method = RequestMethod.POST)
	public String login(@RequestParam(value="email") String email,
						@RequestParam(value="password") String password) {
		
		System.out.println(email);
		System.out.println(password);
		System.out.println("Charging your credit card 💰💰💰💰");
		
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String whatever() {
		return "result.jsp";
	}

}

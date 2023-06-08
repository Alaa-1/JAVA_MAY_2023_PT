package com.alaa.helloviews.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	
	@RequestMapping("/")
//	Dependency Injection
	public String index (Model model) {
		
		String test = "<h1>This is a test !!</h1><script>alert('You Have Been PWND')</script>";
				
		String username = "Joe Doe";
		model.addAttribute("name", username);
		model.addAttribute("test", test);
		return "index.jsp";
	}
	
	@RequestMapping("/other")
	public String other(Model mdl) {
		
//		mdl.addAttribute("age", 45);
		ArrayList<String> dojos = new ArrayList<String>();
		dojos.add("San Jose");
		dojos.add("BurBank");
		dojos.add("Seattle");
//		dojos.add("Tunisia");
		
		mdl.addAttribute("dojosList",dojos);
		return "dojos.jsp";
	}

}

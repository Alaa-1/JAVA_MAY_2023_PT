package com.alaa.more.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class FlashController {

	@RequestMapping("/index")
	public String index() {
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/processCar", method = RequestMethod.POST)
	public String processcar(@RequestParam("make") String make,
								@RequestParam("model") String model,
								@RequestParam("year") int year,
								@RequestParam("color") String color,
								HttpSession s,
								RedirectAttributes flash) {
		
		
		s.setAttribute("keyMake", make);
		s.setAttribute("keyModel", model);
		s.setAttribute("keyYear", year);
		s.setAttribute("keyColor", color);
		
		if (year <2015) {
			System.out.println("too old");
			flash.addFlashAttribute("YearError", "Car is Too Old !!");
			return "redirect:/index";
		}else {
			System.out.println("Cool !");
			flash.addFlashAttribute("success", "You have created a car succefully !");
			return "redirect:/result";
		}
		
		
	}
	
	@RequestMapping("/result")
	public String show() {
		
		return "showCar.jsp";
	}
	
}

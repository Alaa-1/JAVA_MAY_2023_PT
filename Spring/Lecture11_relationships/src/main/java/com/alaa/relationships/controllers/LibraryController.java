package com.alaa.relationships.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alaa.relationships.models.Library;
import com.alaa.relationships.services.LibraryService;

import jakarta.validation.Valid;

@Controller
public class LibraryController {
	
	@Autowired
	private LibraryService libServ;
	
	// READ ALL
	@GetMapping("/libraries")
	public String libs(@ModelAttribute("library") Library lib ,Model model) {
		
		List <Library> allLibs = libServ.allLibs();
		model.addAttribute("allLibs", allLibs); 
		return "libs.jsp";
	}
	
	
	@PostMapping("/libraries")
	public String createLibrary(@Valid @ModelAttribute("library") Library lib,
								BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			List <Library> allLibs = libServ.allLibs();
			model.addAttribute("allLibs", allLibs); 
			return "libs.jsp";
		} else {
			
			//if there is no errors save the library
			libServ.createLibrary(lib);
			return "redirect:/libraries";
		}
	}
	
	
	@GetMapping("/libraries/{id}")
	public String showLibrary(@PathVariable("id") Long id, Model model) {
		
		Library lib = libServ.findLibrary(id);
		model.addAttribute("library", lib);
		
		return "showlib.jsp";
	}
	
	

}

package com.alaa.introspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
//	http://localhost:8080
	 @RequestMapping("/")
     public String hello() {
             return "Hello From Spring Boot!";
     }
	 
	 @RequestMapping("/home")
	 public String home() {
		 
		 return  "<h1>This is the HOME page !!</h1><br><p>hi</p>";
	 }
	 
//		========= QUERY PARAMETER =========

//	 http://localhost:8080/search?query=spring
	 @RequestMapping("/search")
	 public String search(@RequestParam(value = "query") String searchQuery) {
		 
		 if (searchQuery == null) {
			 return "There's nothing to see here";
		 }
		 
		 return "You searched for " + searchQuery;
	 }
	 
//   ========= PathVariables ========
	 
//	 http://localhost:8080/users/5/edit
	 
	 @RequestMapping("/users/{user_id}/edit")
	 public String update(@PathVariable("user_id") String id) {
		 
		 return "Update the user with ID: " + id;
	 }
	 
	 @RequestMapping("/hello/{name}/{count}/{var}")
	 public String find(@PathVariable("name") String name,
			 			@PathVariable("count") Integer count,
			 			@PathVariable("var") String var) {
		 
		 if(count > 10) {
			 return name + " has too many " + var;
		 }
		 return "you found "  + name + "  and they have " + count + " " + var;
		 
	 }
	 
	 
	 
}

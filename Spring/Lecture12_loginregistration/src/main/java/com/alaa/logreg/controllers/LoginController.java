package com.alaa.logreg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alaa.logreg.models.LoginUser;
import com.alaa.logreg.models.User;
import com.alaa.logreg.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;



@Controller
public class LoginController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String displayLoginForm(Model model) {
		
		model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	// REGISTER - ACTION ROUTE
	 @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
		 
		 // execute the Service to Register first
	        userService.register(newUser, result);
	        
	        if(result.hasErrors()) {
	            
	            model.addAttribute("newLogin", new LoginUser());
	            return "index.jsp";
	        }else {
	        	// if no errors here
	        	session.setAttribute("user_id", newUser.getId());
	        	return "redirect:/success";
	        }
}
	 
	 
	 
	 // LOGIN - ACTION ROUTE
	 @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
	        User user = userService.login(newLogin, result);
	    
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "index.jsp";
	        }
	    
	        // No errors! 
	     // TO-DO Later: Store their ID from the DB in session, 
	        session.setAttribute("user_id", user.getId());
	        return "redirect:/success";
	    }
	 
	 
	    
	 // RENDER ROUTE
	 @GetMapping("/success")
	 public String success(HttpSession s, Model model) {
		 // fetch the userID from the session
		 Long userId = (Long) s.getAttribute("user_id");
		 
		 // Route Guard
		 if( userId == null) {
			 return "redirect:/index";
		 } else {
			 // find a user by ID
			 User potentialUser = userService.findOne(userId);
			 model.addAttribute("name", potentialUser.getUserName());
			 return "success.jsp";
		 }
		 	 
	 }
	 
	 	// LOGOUT
	    @GetMapping("/logout")
	    public String logout(HttpSession s) {
	    	s.invalidate();
	    	return "redirect:/index";
	    }
	    
	 
	 
}
package com.alaa.logreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.alaa.logreg.models.LoginUser;
import com.alaa.logreg.models.User;
import com.alaa.logreg.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	// Reject if email is taken (present in DB)
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	if(potentialUser.isPresent()) {
    		result.rejectValue("email", "RegisterError", "Email is taken!");
    	}
    	
    	if (!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("password", "RegisterError", "password does not match");
    	}
    	
    	if(result.hasErrors()) {
    		return null;
    	}else {
    		// Hash and set password
    		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    		newUser.setPassword(hashed);
    		// SAVE THE USER
    		return userRepo.save(newUser);
    		
    	}
 
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
//      FIND IF THE USER IS IN THE DB?
		Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
      if (!potentialUser.isPresent()) {
			result.rejectValue("email", "loginErrors", "email is not found");
      } else {
      	User user = potentialUser.get();
//      	check pw 
      	if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
				result.rejectValue("password", "loginErrors", "invalid password");
      	}
      	if (result.hasErrors()) {
      		return null;
      	} else {
      		return user;
      	}
      }
		return null;
  }
    
    
    
// ----------------------------------------------------------------------------
//	UPDATE
	public User updateUser(User u) {
		return userRepo.save(u);
	}
	
//  READ ONE
   public User findOne(Long id) {
	   
   	Optional<User> maybeUser = userRepo.findById(id);
   	if(maybeUser.isPresent()) {
   		return maybeUser.get();
   	} else {
   		return null;
   	}
   }
  
    
}

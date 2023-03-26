package com.flight_reservation_app_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_2.entities.User;
import com.flight_reservation_app_2.repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@RequestMapping("/loginPage")
	public String login() {
		return "login/login";
	}
     @RequestMapping("/showReg")
	public String showRegi() {
		return "login/showReg";
	}
     @RequestMapping("/saveReg")
     public String saveReg(@ModelAttribute("user")User user) {
    	 userRepo.save(user);
		return "login/login";
     }
     @RequestMapping("/verifyLogin")
     public String verify(@RequestParam("emailId")String email,
    		              @RequestParam("password")String password,
    		              ModelMap model) {
    	   User user=userRepo.findByEmail(email);
    	   if(user!=null) {
    		   if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
        		   return "findFlights";
        	   }else {
        		   model.addAttribute("error", "Invalid username/password");
        		   return "login/login";
        	   }
    	   }
    	   else {
    		   model.addAttribute("error", "Invalid username/password");
    		   return "login/login";
    	   }
    	  
		
    	 
     }
}

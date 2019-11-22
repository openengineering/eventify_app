package com.groupfifteen.auth.web;

import com.groupfifteen.auth.model.*;
import com.groupfifteen.auth.service.*;
import com.groupfifteen.auth.validator.UserValidator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    private EventService eventService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/home"})
    public String home(Model model) {
    	UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	if(user != null) {
    		System.out.println("Logged in user: "+user.getUsername());
    		return "redirect:/welcome";
    	}else {
    		System.out.println("Home: No user");
    		return "index";
    	}
    }
    
    @GetMapping("/welcome")
    public String welcome(Model model) {
    	UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	String myusername = user.getUsername();
    	
    	
    	List<Event> allEvents = eventService.findAll();
    	
    	
    	model.addAttribute("events", allEvents);
    	
    	return "welcome";
    }
    
}

package com.groupfifteen.auth.web;

import com.groupfifteen.auth.model.Event;
import com.groupfifteen.auth.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {
	@Autowired
	private EventService eventService;
	
	@GetMapping("/event_creation")
	public String event_creation(Model model) {
		model.addAttribute("eventForm", new Event());
		
		return "event_creation";
	}
	
	@PostMapping("/event_creation")
	public String event_creation(@ModelAttribute("eventForm") Event eventForm, BindingResult bindingResult){
		eventService.save(eventForm);
		
		return "redirect:/welcome";
	}
}

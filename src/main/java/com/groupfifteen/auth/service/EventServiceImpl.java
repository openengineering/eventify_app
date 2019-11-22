package com.groupfifteen.auth.service;

import com.groupfifteen.auth.model.*;
import com.groupfifteen.auth.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
	@Autowired
	private UserRepository userRepository;
    @Autowired
    private EventRepository eventRepository;
    
    @Override
    public void save(Event event) {
    	HashSet<User> owner = new HashSet<>();
    	UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	String username = user.getUsername();
    	System.out.println("Logged User: "+username);
    	User myOwner = userRepository.findByUsername(username);
    	if(myOwner != null) {
    		System.out.println("User confirmed: "+myOwner.getName());
    	}else {
    		System.out.println("User not confirmed");
    	}
    	owner.add(myOwner);
    	event.setOwnerUsers(owner);
        eventRepository.save(event);
    }
    
    @Override
    public List<Event> findAll(){
    	return eventRepository.findAll();
    }

    @Override
    public Event findByName(String name) {
        return eventRepository.findByName(name);
    }
}

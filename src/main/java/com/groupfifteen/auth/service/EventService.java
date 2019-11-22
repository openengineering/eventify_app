package com.groupfifteen.auth.service;

import java.util.List;

import com.groupfifteen.auth.model.Event;

public interface EventService {
    void save(Event event);

    Event findByName(String name);
    
    List<Event> findAll();
}

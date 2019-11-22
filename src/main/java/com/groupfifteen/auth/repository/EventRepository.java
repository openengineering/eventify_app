package com.groupfifteen.auth.repository;

import com.groupfifteen.auth.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long>{
	Event findByName(String name);
}

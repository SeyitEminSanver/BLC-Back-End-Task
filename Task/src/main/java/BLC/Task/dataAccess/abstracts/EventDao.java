package BLC.Task.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import BLC.Task.entities.concretes.Event;

public interface EventDao extends JpaRepository<Event,Integer>{

	
}

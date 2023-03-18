package BLC.Task.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BLC.Task.business.abstracts.EventService;
import BLC.Task.entities.concretes.Event;

@RestController
@RequestMapping("/api/event")
public class EventsController {

	private EventService eventService;

	@Autowired
	public EventsController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	
	@GetMapping("/getall")
	public List<Event> getAll(){
		return this.eventService.getAll();
	}
	
	
}

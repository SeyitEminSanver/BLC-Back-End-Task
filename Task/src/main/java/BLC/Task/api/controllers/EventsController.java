package BLC.Task.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BLC.Task.business.abstracts.EventService;
import BLC.Task.core.utilities.results.DataResult;
import BLC.Task.core.utilities.results.Result;
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
	public DataResult<List<Event>> getAll(){
		return this.eventService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Event event){
		return this.eventService.add(event);
	}
	
	@PostMapping("/update/{eventName}")
	public Result update(@RequestParam String eventName,Event event)
	{
		return this.eventService.update(eventName, event);
	}
	
	@PostMapping("/delete")
    public Result delete(Event event)
    {
		return this.eventService.delete(event);
    }
	
}

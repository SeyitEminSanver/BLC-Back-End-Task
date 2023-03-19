package BLC.Task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BLC.Task.business.abstracts.EventService;
import BLC.Task.core.utilities.results.DataResult;
import BLC.Task.core.utilities.results.Result;
import BLC.Task.core.utilities.results.SuccessDataResult;
import BLC.Task.core.utilities.results.SuccessResult;
import BLC.Task.dataAccess.abstracts.EventDao;
import BLC.Task.entities.concretes.Event;

@Service
public class EventManager implements EventService{

	private EventDao eventDao;
	
	@Autowired
	public EventManager(EventDao eventDao) {
		super();
		this.eventDao = eventDao;
	}

	@Override
	public DataResult<List<Event>> getAll() {
		return new SuccessDataResult<List<Event>>(this.eventDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Event event) {
		this.eventDao.save(event);
		return new SuccessResult("Ürün eklendi");
	}

	@Override
	public Result update(String eventName, Event updatedEvent) {
	    Event oldEvent = this.eventDao.getByeventName(eventName);
	    oldEvent.setEndDate(updatedEvent.getEndDate());
	    oldEvent.setEventName(updatedEvent.getEventName());
	    oldEvent.setEventId(updatedEvent.getEventId());
	    oldEvent.setStartDate(updatedEvent.getStartDate());
	    oldEvent.setQuota(updatedEvent.getQuota());
	    oldEvent.setNumberOfParticipants(updatedEvent.getNumberOfParticipants());
	    this.eventDao.save(oldEvent);
	    return new SuccessResult("Etkinlik güncellendi");
	}

	@Override
	public Result delete(Event event) {
		this.eventDao.delete(event);
		return new SuccessResult("Etkinlik silindi");
	}
	   
	}
	



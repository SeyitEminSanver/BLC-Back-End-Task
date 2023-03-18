package BLC.Task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BLC.Task.business.abstracts.EventService;
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
	public List<Event> getAll() {
		return eventDao.findAll();
	}

}

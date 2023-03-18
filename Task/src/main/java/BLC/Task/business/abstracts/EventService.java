package BLC.Task.business.abstracts;

import java.util.List;

import BLC.Task.entities.concretes.Event;

public interface EventService {
	List<Event> getAll();
}

package BLC.Task.business.abstracts;

import java.util.List;

import BLC.Task.core.utilities.results.DataResult;
import BLC.Task.core.utilities.results.Result;
import BLC.Task.entities.concretes.Event;

public interface EventService {
	DataResult<List<Event>> getAll();
	Result add(Event event);
	Result update(String eventName,Event event);
	Result delete(Event event);
}

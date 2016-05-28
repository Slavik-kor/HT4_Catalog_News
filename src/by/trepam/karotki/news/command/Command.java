package by.trepam.karotki.news.command;

import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;

public interface Command {
	
	Response execute(Request request);

}

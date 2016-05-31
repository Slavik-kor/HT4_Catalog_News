package by.trepam.karotki.news.service;

import java.util.ArrayList;

import by.trepam.karotki.news.service.exception.ServiceException;

public interface HelpService {
	
	ArrayList<String> getCommands() throws ServiceException;

}

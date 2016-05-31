package by.trepam.karotki.news.service.impl;

import java.util.ArrayList;

import by.trepam.karotki.news.controller.CommandName;
import by.trepam.karotki.news.service.HelpService;
import by.trepam.karotki.news.service.exception.ServiceException;

public class HelpServiceImpl implements HelpService {
	
	public ArrayList<String> getCommands() throws ServiceException{
		ArrayList<String> list=new ArrayList<String>();
		for (int i=0;i<CommandName.values().length;i++){
			list.add(CommandName.values()[i].getDescritpion());
		}
		return list;
	}

}

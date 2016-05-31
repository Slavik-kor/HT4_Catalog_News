package by.trepam.karotki.news.service;

import by.trepam.karotki.news.service.impl.HelpServiceImpl;
import by.trepam.karotki.news.service.impl.NewsServiceImpl;

public class ServiceFactory {
	private static IService iService= new NewsServiceImpl();
	private static HelpService hService= new HelpServiceImpl();
	
	private ServiceFactory(){
		super();
	}
	
	public static ServiceFactory getInstance(){
		return new ServiceFactory();
	}
	
	public IService getNewsService(){
		return iService;
	}
	
	public HelpService getHelpService(){
		return hService;
	}
	
}

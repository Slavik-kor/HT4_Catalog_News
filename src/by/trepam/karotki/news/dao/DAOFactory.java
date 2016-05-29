package by.trepam.karotki.news.dao;

import by.trepam.karotki.news.dao.impl.INewsDAOImpl;

public class DAOFactory {
	private static INewsDAO newsDao=new INewsDAOImpl();
	
	private DAOFactory(){
		super();
	}
	
	public static DAOFactory getInstance(){
		return new DAOFactory();
	} 
	
	public INewsDAO getINewsDAO(){
		return newsDao;
	}
	
	

}

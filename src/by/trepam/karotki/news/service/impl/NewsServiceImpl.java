package by.trepam.karotki.news.service.impl;

import by.trepam.karotki.news.dao.DAOFactory;
import by.trepam.karotki.news.dao.INewsDAO;
import by.trepam.karotki.news.dao.exception.DAOException;
import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.service.IService;
import by.trepam.karotki.news.service.exception.ServiceException;

public class NewsServiceImpl implements IService{
	
	public boolean saveNewNews(News news,String subcategory,String category) throws ServiceException{
		DAOFactory factory=DAOFactory.getInstance();
		INewsDAO newsDAO=factory.getINewsDAO();
		try{
			if (newsDAO.saveNews(news, subcategory, category)){return true;}		
		}catch(DAOException e){
			throw new ServiceException("error in Service layer",e);
		}
		return false;
	}
	
	public Catalog getCatalog() throws ServiceException{
		DAOFactory factory=DAOFactory.getInstance();
		INewsDAO newsDAO=factory.getINewsDAO();
		Catalog catalog=null;
		try{
			catalog=newsDAO.getCatalog();		
		}catch(DAOException e){throw new ServiceException("error in Service layer",e);
		}
		return catalog;
	}

}

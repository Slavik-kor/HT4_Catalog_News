package by.trepam.karotki.news.service;

import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.service.exception.ServiceException;

public interface IService {
	
	void saveNewNews(News news,String subCategory, String category) throws ServiceException;
	Catalog getCatalog() throws ServiceException;

}

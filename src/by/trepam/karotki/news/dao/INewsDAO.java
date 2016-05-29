package by.trepam.karotki.news.dao;

import by.trepam.karotki.news.dao.exception.DAOException;
import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.News;


public interface INewsDAO {

	void saveNews(News news, String subcategory, String category) throws DAOException;
	Catalog getCatalog() throws DAOException; 
}

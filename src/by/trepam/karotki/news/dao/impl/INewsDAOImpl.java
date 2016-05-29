package by.trepam.karotki.news.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import by.trepam.karotki.news.dao.INewsDAO;
import by.trepam.karotki.news.dao.exception.DAOException;
import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.Category;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.entity.SubCategory;

public class INewsDAOImpl implements INewsDAO {
	private static String fileName = "catalog.xml";

	public void saveNews(News news, String subCategory, String category) throws DAOException {
		Catalog catalog=getDataFromFile();
		for (int i=0;i<catalog.getCategoryList().size();i++)
		{
			Category cat=catalog.getCategoryList().get(i);
			if (cat.getName().toUpperCase().equals(category.toUpperCase())){
				for (int j=0;j<cat.getSubList().size();j++){
					SubCategory sub=cat.getSubList().get(j);
					if (sub.getName().toUpperCase().equals(subCategory.toUpperCase())){
						sub.addNews(news);
					}
				}
			}
		}
		
		setDataToFile(catalog);
	
		
	}

	private Catalog getDataFromFile() throws DAOException{
		Catalog catalog=null;
		try{
				File file=new File(fileName);	
			JAXBContext context=JAXBContext.newInstance(Catalog.class);
			Unmarshaller unmarshaller=context.createUnmarshaller();
			catalog=(Catalog)unmarshaller.unmarshal(file);
			} catch (JAXBException e) {throw new DAOException("Error in DAO layer", e);
			}
		   			return catalog;
		}
	
	private void setDataToFile(Catalog catalog) throws DAOException{
		
		try{	
			JAXBContext context=JAXBContext.newInstance(Catalog.class);
			Marshaller marshaller=context.createMarshaller();
			marshaller.marshal(catalog, new FileOutputStream(new File(fileName)));
			} catch (JAXBException e) {throw new DAOException("Ошибка в слое DAO", e);
			} catch (FileNotFoundException e){ throw new DAOException(fileName+"not found. Error in DAO layer", e);}
		}
	
	

	public Catalog getCatalog() throws DAOException {
		
	return getDataFromFile();

	}

}

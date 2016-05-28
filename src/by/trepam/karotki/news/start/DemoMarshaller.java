package by.trepam.karotki.news.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.Category;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.entity.SubCategory;

public class DemoMarshaller {
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException{
		JAXBContext context=JAXBContext.newInstance(Catalog.class);
		Marshaller m=context.createMarshaller();
	
		News news1=new News();
		news1.setNewsName("Новость1");
		news1.setDateOfIssue("19/05/2016");
		news1.setProvider("Правда");
		news1.setNewsBody("Текст новости");
		
		News news2=new News();
		news2.setNewsName("Новость2");
		news2.setDateOfIssue("29/05/2016");
		news2.setProvider("газета Правда");
		news2.setNewsBody("Текст новости");
		
		News news3=new News();
		news3.setNewsName("Новость3");
		news3.setDateOfIssue("29/05/2016");
		news3.setProvider("газета Правда");
		news3.setNewsBody("Текст новости");
		
		News news4=new News();
		news4.setNewsName("Новость3");
		news4.setDateOfIssue("29/05/2016");
		news4.setProvider("газета Правда");
		news4.setNewsBody("Текст новости");
		
		SubCategory subCategory1= new SubCategory("Подкатегория1");
		subCategory1.addNews(news1);
		subCategory1.addNews(news3);
		
		SubCategory subCategory2= new SubCategory("Подкатегория2");
		subCategory2.addNews(news2);
		
		SubCategory subCategory3= new SubCategory("Подкатегория3");
		subCategory3.addNews(news3);
		
		SubCategory subCategory4= new SubCategory("Подкатегория4");
		subCategory4.addNews(news4);
		subCategory4.addNews(news1);
		
		Category cat1= new Category("Категория1");
		cat1.addSubCategory(subCategory1);
		cat1.addSubCategory(subCategory2);
		
		
		Category cat2= new Category("Категория2");
		cat2.addSubCategory(subCategory3);
		cat2.addSubCategory(subCategory4);
		
		Catalog catalog= new Catalog();
		catalog.addCategory(cat1);
		catalog.addCategory(cat2);
		

		m.marshal(catalog, new FileOutputStream(new File("catalog.xml")));
		System.out.println("Файл xml создан");
		
		
	}

}

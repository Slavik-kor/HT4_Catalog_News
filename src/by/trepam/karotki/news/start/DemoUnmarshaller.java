package by.trepam.karotki.news.start;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import by.trepam.karotki.news.entity.Catalog;

public class DemoUnmarshaller{
	
	public static void main(String[] args) throws JAXBException {
		File file= new File("catalog.xml");
		JAXBContext context=JAXBContext.newInstance(Catalog.class);
		
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Catalog catalog=(Catalog)unmarshaller.unmarshal(file);
		System.out.println(catalog.getCategoryList().get(1).getName());
		
	}

}

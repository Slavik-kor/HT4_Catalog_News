package by.trepam.karotki.news.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Catalog", propOrder={"categoryList"})
@XmlRootElement
public class Catalog {
	@XmlElement(required=true)
	private ArrayList<Category> categoryList= new ArrayList<Category>();
	
	public void addCategory(Category category){
		categoryList.add(category);
	}
	
	public ArrayList<Category> getCategoryList(){
		return categoryList;
	}

}

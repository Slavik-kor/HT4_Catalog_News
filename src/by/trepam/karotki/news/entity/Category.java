package by.trepam.karotki.news.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = { "subCategoryList" })
public class Category {
	@XmlAttribute(required = true)
	private String name = "";
	@XmlElement(required = true)
	private ArrayList<SubCategory> subCategoryList = new ArrayList<SubCategory>();

	public Category() {
		super();
	}

	public Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addSubCategory(SubCategory sub) {
		subCategoryList.add(sub);
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<SubCategory> getSubList() {
		return subCategoryList;
	}

	public void setSublist(ArrayList<SubCategory> list) {
		subCategoryList = list;
	}

	public boolean addNews(News news, String subCategoryName) {

		for (int i = 0; i < subCategoryList.size(); i++) {
			if (subCategoryList.get(i).getName().equals(subCategoryName)) {
				subCategoryList.get(i).addNews(news);
				return true;
			}
		}
		return false;

	}

}
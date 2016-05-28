package by.trepam.karotki.news.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategory", propOrder = { "NewsList" })
public class SubCategory {
	@XmlAttribute(required = true)
	private String name = "";
	@XmlElement(required = true)
	private ArrayList<News> NewsList = new ArrayList<News>();

	public SubCategory() {
		super();
	}

	public SubCategory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<News> getList() {
		return NewsList;
	}

	public void setlist(ArrayList<News> list) {
		NewsList = list;
	}

	public void addNews(News news) {
		NewsList.add(news);
	}

	public int getIndexNewsByName(String name) {
		for (int i = 0; i < NewsList.size(); i++) {
			if (NewsList.get(i).getNewsName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

}

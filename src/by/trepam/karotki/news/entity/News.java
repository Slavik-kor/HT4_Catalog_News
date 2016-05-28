package by.trepam.karotki.news.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="News", propOrder={"newsName", "provider", "dateOfIssue", "newsBody"})
public class News {
	
@XmlElement(required=true)
	private String newsName="";
@XmlElement(required=true)
	private String provider="";
@XmlElement(required=true)
	private String dateOfIssue="";
@XmlElement(required=true)
	private String newsBody="";
	
	public String getNewsName(){
		return newsName;
	}
	
	public void setNewsName(String newsName){
		this.newsName=newsName;
	}
	
	public String getProvider(){
		return provider;
	}
	
	public void setProvider(String provider){
		this.provider=provider;
	}
	
	public String getDateOfIssue(){
		return dateOfIssue;
	}
	
	public void setDateOfIssue(String dateOfIssue){
		this.dateOfIssue=dateOfIssue;
	}
	
	public String getNewsBody(){
		return newsBody;
	}
	
	public void setNewsBody(String newsBody){
		this.newsBody=newsBody;
	}

}

package by.trepam.karotki.news.entity;

import java.util.ArrayList;

public class Response {
	private ArrayList<String> messageList;
	private String respMessage;
	private String errorMessage;
	//private Catalog catalog;
	
	public String getMessage(){
		return respMessage;
	}
	
	public void setMessage(String msg){
		respMessage=msg;
	}

	/**public Catalog getCatalog() {
		return catalog;
	}

	public void addCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
*/
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ArrayList<String> getMessageList() {
		return messageList;
	}

	public void setMessageList(ArrayList<String> messageList) {
		this.messageList = messageList;
	}

}

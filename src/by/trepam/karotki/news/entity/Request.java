package by.trepam.karotki.news.entity;

public class Request {
	
	private String commandName;
	private String title;
	private String date;
	private String provider;
	private String body;
	private String subCategory;
	private String category;
	private String[] commandLine;
	
	
	public String getCommandName(){
		return commandName;
	}
	
	public void setCommandName(String command){
		commandName=command;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String[] getCommandLine() {
		return commandLine;
	}

	public void setCommandLine(String[] commandLine) {
		this.commandLine = commandLine;
	}

}

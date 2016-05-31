package by.trepam.karotki.news.controller;

public enum CommandName {
	TEST("test - command for testing application"),
	GET("get - command for getting all list of news with categories and subcategories"),
	ADD("add <Category> <Subcategory> <Title of news> <Date of issue> <Provider> <body of news> - command for adding new news"), 
	HELP("help - command for outputting list of command");

	private String description;

	private CommandName(String description) {
		this.description = description;
	}
	
	public String getDescritpion(){
		return description;
	}
	
	
}

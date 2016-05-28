package by.trepam.karotki.news.view;

import by.trepam.karotki.news.entity.Request;

public class View {

	public Request doUserAction(String command){
		Request request=new Request();
		request.setCommandName(command);
		return request;
	}
	
}

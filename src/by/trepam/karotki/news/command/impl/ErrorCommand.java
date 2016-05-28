package by.trepam.karotki.news.command.impl;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;

public class ErrorCommand implements Command{
	
	public Response execute(Request request){
		Response resp=new Response();
		resp.setMessage("Error: Wrong command");
		return resp;
	}

}

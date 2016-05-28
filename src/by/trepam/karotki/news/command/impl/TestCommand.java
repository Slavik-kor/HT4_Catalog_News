package by.trepam.karotki.news.command.impl;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;

public class TestCommand implements Command{
	
	public Response execute(Request request){
		String title=request.getCommandName();
		Response resp= new Response();
		resp.setMessage("������� "+title+" ������� ���������");
		return resp;
	}

}

package by.trepam.karotki.news.controller;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;

public class Controller {
	
	CommandHelper helper= new CommandHelper();
	
	public Response doAction(Request request){
		String commandName=request.getCommandName();
		Command command=helper.getCommand(commandName);
		Response resp = command.execute(request);
		return resp;
	}

}

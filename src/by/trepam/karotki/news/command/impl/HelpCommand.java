package by.trepam.karotki.news.command.impl;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;
import by.trepam.karotki.news.service.HelpService;
import by.trepam.karotki.news.service.ServiceFactory;
import by.trepam.karotki.news.service.exception.ServiceException;

public class HelpCommand implements Command{
   
	public Response execute(Request request){
		Response response=new Response();
		ServiceFactory factory=ServiceFactory.getInstance();
		HelpService service=factory.getHelpService();
		
		try{
		
		response.setMessage("List of available commands:");
		response.setMessageList(service.getCommands());
		response.setStatus(true);
		}catch(ServiceException e){ 
			e.printStackTrace();
			response.setErrorMessage("error in Command layer");
			response.setStatus(false);	
		}
		
		return response;
	}
}

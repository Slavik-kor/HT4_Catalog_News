package by.trepam.karotki.news.command.impl;

import java.util.ArrayList;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.Category;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;
import by.trepam.karotki.news.entity.SubCategory;
import by.trepam.karotki.news.service.IService;
import by.trepam.karotki.news.service.ServiceFactory;
import by.trepam.karotki.news.service.exception.ServiceException;

public class GetCommand implements Command{
	
	public Response execute(Request request){
		String commandName=request.getCommandName();
		
		ServiceFactory factory=ServiceFactory.getInstance();
		IService service=factory.getNewsService();
		Response response=new Response();
		try{
			Catalog catalog=service.getCatalog();
			
			ArrayList<String> list=new ArrayList<String>();
		    list.add("Каталог");
			for (int i=0;i<catalog.getCategoryList().size();i++){
				Category cat=catalog.getCategoryList().get(i);
				list.add(cat.getName());
			
				for(int j=0;j<cat.getSubList().size();j++){
					SubCategory sub=cat.getSubList().get(j);
					list.add("   "+sub.getName());
					
					for(int k=0;k<sub.getList().size();k++){
						News news=sub.getList().get(k);
						list.add("      "+news.getNewsName()+"  "+news.getDateOfIssue()+
								"  "+news.getProvider()+"  "+news.getNewsBody());
					}
				}
								
			}
			response.setMessageList(list);
			response.setMessage(commandName+" completed");
			response.setStatus(true);
		}catch(ServiceException e){
			e.printStackTrace();
			response.setErrorMessage("Error in layer command");
			response.setStatus(false);}
		return response;
	}

}

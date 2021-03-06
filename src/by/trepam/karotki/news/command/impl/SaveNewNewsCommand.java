package by.trepam.karotki.news.command.impl;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;
import by.trepam.karotki.news.service.IService;
import by.trepam.karotki.news.service.ServiceFactory;
import by.trepam.karotki.news.service.exception.ServiceException;

public class SaveNewNewsCommand implements Command {

	public Response execute(Request request) {
		String category = request.getCategory();
		String subCategory = request.getSubCategory();
		
		News news = new News();
		news.setNewsName(request.getTitle());
		news.setDateOfIssue(request.getDate());
		news.setProvider(request.getProvider());
		news.setNewsBody(request.getBody());

		ServiceFactory factory = ServiceFactory.getInstance();
		IService service = factory.getNewsService();
		Response response = new Response();

		try {
			response.setStatus(service.saveNewNews(news, subCategory, category));
			if (response.isStatus()){
				response.setMessage(" News was successfully added");
				}else{
					response.setErrorMessage( "News wasn't been added!");
				}
			
		} catch (ServiceException e) {
			e.printStackTrace();
			response.setErrorMessage("Error in layer command");
			response.setStatus(false);
		}
		return response;
	}

}

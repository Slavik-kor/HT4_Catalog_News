package by.trepam.karotki.news.view;

import by.trepam.karotki.news.entity.Request;

public class View {

	public Request doUserAction(String[] args) {
		Request request = new Request();
		request.setCommandName(args[0]);
		for (int i = 0; i < args.length; i++) {
			switch (i) {
			case 0:
				request.setCommandName(args[i]);
				break;
			case 1:
				request.setCategory(args[i]);
				break;
			case 2:
				request.setSubCategory(args[i]);
				break;
			case 3:
				request.setTitle(args[i]);
				break;
			case 4:
				request.setDate(args[i]);
				break;
			case 5:
				request.setProvider(args[i]);
				break;
			case 6:
				request.setBody(args[i]);
				break;	

			}
		}

		request.setCommandLine(args);
		return request;
	}

}

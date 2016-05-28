package by.trepam.karotki.news.service.exception;


public class ServiceException extends Exception{
	private static final long serialVersionUID = 3154732359143607558L;

	public ServiceException(){
		super();
	}
	
	public ServiceException(String message){
		super(message);
	}
	
	public ServiceException(String message,Exception e){
		super(message,e);
	}

}

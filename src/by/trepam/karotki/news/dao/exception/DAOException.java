package by.trepam.karotki.news.dao.exception;

public class DAOException extends Exception {

	private static final long serialVersionUID = -5769746985047920426L;
	
	 public DAOException(){
		 super();
	 }
	 
	 public DAOException(String message){
		 super(message);
	 } 
	 
	 public DAOException(String message,Exception e){
		 super(message,e);
	 }
	
}

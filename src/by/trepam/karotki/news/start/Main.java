package by.trepam.karotki.news.start;

import java.util.Scanner;

import by.trepam.karotki.news.controller.Controller;
import by.trepam.karotki.news.entity.Request;
import by.trepam.karotki.news.entity.Response;
import by.trepam.karotki.news.view.View;

public class Main {

	public static void main(String[] args) {
		
		AddDecor.head();
		
		Controller controller= new Controller();
		View view= new View();
		
		Scanner sc= new Scanner(System.in);
		String line="";
		while ((line=sc.nextLine())!=null){
			Request request= view.doUserAction(line);
			Response response=controller.doAction(request);
			System.out.println(response.getMessage());
		}
		
sc.close();
	
	}

}

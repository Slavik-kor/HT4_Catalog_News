package by.trepam.karotki.news.controller;

import java.util.HashMap;
import java.util.Map;

import by.trepam.karotki.news.command.Command;
import by.trepam.karotki.news.command.impl.ErrorCommand;
import by.trepam.karotki.news.command.impl.GetCommand;
import by.trepam.karotki.news.command.impl.HelpCommand;
import by.trepam.karotki.news.command.impl.SaveNewNewsCommand;
import by.trepam.karotki.news.command.impl.TestCommand;

public class CommandHelper {

	private Map<CommandName,Command> commands= new HashMap<CommandName,Command>();
	
	public CommandHelper(){
		commands.put(CommandName.TEST, new TestCommand());
		commands.put(CommandName.GET, new GetCommand());
		commands.put(CommandName.ADD, new SaveNewNewsCommand());
		commands.put(CommandName.HELP, new HelpCommand());
	}
	
	public Command getCommand(String name){
		CommandName commandName;
		try{commandName=CommandName.valueOf(name.toUpperCase());
		}catch (IllegalArgumentException e){ return new ErrorCommand();}
		Command com=commands.get(commandName);
		if (com==null){return new ErrorCommand();}
		return com;
	}

}

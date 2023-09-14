package com.example.demo.designPattern.behavioural.command;

/**
 * @author Rahil_Khan
 * The command pattern allows you to decouple the REQUESTER of an ACTION
 * from the OBJECT that actually performs the action.
 */
public interface Command {

	public void execute();
	public void unExecute();
}

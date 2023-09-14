/**
 * 
 */
package com.example.demo.designPattern.behavioural.command.lightcommand;

import com.example.demo.designPattern.behavioural.command.Command;

/**
 * @author Rahil_Khan
 * 
 */
public class SimpleRemoteControl {

	Command slot;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void exectue() {
		slot.execute();
	}
}

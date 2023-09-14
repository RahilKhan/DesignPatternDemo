package com.example.demo.designPattern.behavioural.command.rccommand;

import com.example.demo.designPattern.behavioural.command.Command;

public class RcJoystickController {

    Command command;

    public RcJoystickController() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void unexecuteCommand() {
        command.unExecute();
    }
}

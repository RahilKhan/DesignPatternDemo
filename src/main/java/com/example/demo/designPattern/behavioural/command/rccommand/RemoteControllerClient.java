package com.example.demo.designPattern.behavioural.command.rccommand;

import com.example.demo.model.RcShip;

public class RemoteControllerClient {

    public static void main(String... args) {
        RcShipXAxisCommand rcShipXAxisCommand = new RcShipXAxisCommand(new RcShip());
        RcShipYAxisCommand rcShipYAxisCommand = new RcShipYAxisCommand(new RcShip());

        RcJoystickController rcJoystickController = new RcJoystickController();
        rcJoystickController.setCommand(rcShipXAxisCommand);
        rcJoystickController.executeCommand();
        rcJoystickController.executeCommand();
        rcJoystickController.executeCommand();
        rcJoystickController.unexecuteCommand();

        rcJoystickController.setCommand(rcShipYAxisCommand);
        rcJoystickController.executeCommand();
        rcJoystickController.unexecuteCommand();
        rcJoystickController.unexecuteCommand();
    }

}

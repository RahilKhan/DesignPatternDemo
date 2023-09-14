package com.example.demo.designPattern.behavioural.command.lightcommand;

import com.example.demo.designPattern.behavioural.command.Command;
import com.example.demo.model.Garage;

/**
 * @author Rahil_Khan
 */
public class GarageCommand implements Command {

    Garage garage;

    public GarageCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.openDoor();
    }

    @Override
    public void unExecute() {
        garage.closeDoor();
    }
}

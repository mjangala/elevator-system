package com.elevator.system.commands;

import com.elevator.system.Elevator;

public class UpCommand implements ElevatorCommand {
    public void execute(Elevator elevator, int toFloorNumber) {
        System.out.println("Moved up by " + (toFloorNumber - elevator.getCurrentFloor()) + " floors from floor Number: " + elevator.getCurrentFloor() + " to floor Number: " + toFloorNumber);
        elevator.setCurrentFloor(toFloorNumber);
    }
}

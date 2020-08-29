package com.elevator.system.commands;

import com.elevator.system.Elevator;

public class DownCommand implements ElevatorCommand {
    public void execute(Elevator elevator, int toFloorNumber) {
        System.out.println("Moved down by " + (elevator.getCurrentFloor() - toFloorNumber) + " floors from floor Number: " + elevator.getCurrentFloor() + " to floor Number: " + toFloorNumber);
        elevator.setCurrentFloor(toFloorNumber);
    }
}

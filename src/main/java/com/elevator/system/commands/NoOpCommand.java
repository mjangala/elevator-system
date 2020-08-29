package com.elevator.system.commands;

import com.elevator.system.Elevator;

public class NoOpCommand implements ElevatorCommand {
    public void execute(Elevator elevator, int toFloorNumber) {
        System.out.println("Operation not found");
    }
}

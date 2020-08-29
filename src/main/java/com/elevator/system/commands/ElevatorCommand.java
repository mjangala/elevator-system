package com.elevator.system.commands;

import com.elevator.system.Elevator;

public interface ElevatorCommand {

    void execute(Elevator elevator, int toFloorNumber);
}

package com.elevator.system;

import com.elevator.system.commands.ElevatorFactory;
import lombok.Data;

@Data
public class Elevator {

    private String name;
    private int currentFloor;

    public Elevator(String name) {
        this.name = name;
        this.currentFloor = 0;
    }

    public void goToFloor(int toFloorNumber) {
        if (toFloorNumber < currentFloor)
            ElevatorFactory.getInstance("DOWN")
                    .execute(this, toFloorNumber);
        else if (toFloorNumber > currentFloor)
            ElevatorFactory.getInstance("UP")
                    .execute(this, toFloorNumber);
        else
            ElevatorFactory.getInstance("Same Floor")
                    .execute(this, toFloorNumber);
    }
}

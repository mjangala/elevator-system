package com.elevator.system;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class Floor {

    private int number;
    private List<ElevatorSpot> elevatorSpots;

    public Floor(int number, List<ElevatorSpot> elevatorSpots) {
        this.number = number;
        this.elevatorSpots = elevatorSpots;
    }

    public Optional<ElevatorSpot> getElevatorSpotByName(String name) {
        return elevatorSpots.stream()
                .filter(i -> i.getName().equals(name))
                .findFirst();
    }
}

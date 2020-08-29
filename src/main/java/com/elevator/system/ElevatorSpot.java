package com.elevator.system;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ElevatorSpot {

    private String name;
    private Elevator elevator;
}

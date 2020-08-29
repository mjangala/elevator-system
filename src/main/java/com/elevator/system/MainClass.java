package com.elevator.system;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        Building building = new Building();

        building.setName("Shopping Complex");
        building.setAddress(Address.builder()
                .addressLine1("addressLine1")
                .addressLine2("addressLine2")
                .pin(500000L)
                .state("state")
                .country("country")
                .build());

        ElevatorSpot elevatorSpot1 = new ElevatorSpot("ES1", new Elevator("E1"));
        ElevatorSpot elevatorSpot2 = new ElevatorSpot("ES2", new Elevator("E2"));
        ElevatorSpot elevatorSpot3 = new ElevatorSpot("ES2", new Elevator("E3"));
        Floor floor1 = new Floor(1, Arrays.asList(elevatorSpot1, elevatorSpot2, elevatorSpot3));
        Floor floor2 = new Floor(2, Arrays.asList(elevatorSpot1, elevatorSpot2, elevatorSpot3));
        Floor floor3 = new Floor(3, Arrays.asList(elevatorSpot1, elevatorSpot2, elevatorSpot3));
        building.setFloors(Arrays.asList(floor1, floor2, floor3));

        building.getFloorByNumber(1)
                .ifPresent(i->i.getElevatorSpotByName("ES1")
                        .ifPresent(j->{j.getElevator().goToFloor(3);
                            j.getElevator().goToFloor(5);
                            j.getElevator().goToFloor(1);
                        }));

    }
}

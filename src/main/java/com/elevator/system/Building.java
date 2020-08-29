package com.elevator.system;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class Building {

    private String name;
    private Address address;
    private List<Floor> floors;

    public Optional<Floor> getFloorByNumber(final int floorNumber) {
        return floors.stream()
                .filter(i->i.getNumber() == floorNumber)
                .findFirst();
    }
}

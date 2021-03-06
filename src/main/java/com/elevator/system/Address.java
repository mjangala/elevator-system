package com.elevator.system;

import lombok.Builder;

@Builder
public class Address {
    private String addressLine1;
    private String addressLine2;
    private Long pin;
    private String city;
    private String state;
    private String country;
}

package com.elevator.system.commands;

public class ElevatorFactory {

    public static ElevatorCommand getInstance(String downOrUp) {
        if (downOrUp.equals("UP")) {
            return new UpCommand();
        } else if (downOrUp.equals("DOWN")) {
            return new DownCommand();
        } else {
            return new NoOpCommand();
        }

    }
}

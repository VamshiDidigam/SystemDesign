package org.example;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorAssignmentStrategy{

    @Override
    public Elevator assignElevator(List<Elevator> elevators) {
        return elevators.get(0);
    }
}

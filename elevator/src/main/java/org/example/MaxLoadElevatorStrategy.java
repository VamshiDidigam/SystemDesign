package org.example;

import java.util.List;

public class MaxLoadElevatorStrategy implements ElevatorAssignmentStrategy{
    @Override
    public Elevator assignElevator(List<ElevatorObserver> elevators) {
        return elevators.get(0);
    }
}

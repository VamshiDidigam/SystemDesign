package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElevatorRequestPublisher {

    List<ElevatorObserver> elevatorObserverList;
    ElevatorAssignmentStrategy elevatorAssignmentStrategy;

    ElevatorRequestPublisher(ElevatorAssignmentStrategy elevatorAssignmentStrategy) {
        this.elevatorObserverList = new ArrayList<>();
        this.elevatorAssignmentStrategy = elevatorAssignmentStrategy;

    }

    void addObserver(ElevatorObserver elevatorObserver) {
        elevatorObserverList.add(elevatorObserver);
    }

    void notifyElevators(int floor) {

        ElevatorObserver elevatorObserver = elevatorAssignmentStrategy.assignElevator(elevatorObserverList);
        elevatorObserver.acceptRequest(floor);
    }
}

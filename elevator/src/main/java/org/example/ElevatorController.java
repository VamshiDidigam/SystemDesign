package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    List<Elevator> elevators = new ArrayList<>();
    ElevatorRequestPublisher elevatorRequestPublisher;


    ElevatorController(int noOfElevators, ElevatorAssignmentStrategy strategy) {

        elevatorRequestPublisher = new ElevatorRequestPublisher(strategy);
        for(int i=0; i<noOfElevators; i++) {
            Elevator elevator = new Elevator(i+1, 1);
            elevators.add(elevator);
            elevatorRequestPublisher.addObserver(elevator);
        }
    }

    void moveElevators() {
        for(Elevator elevator: elevators) {
            elevator.move();
        }
    }

    void requestElevator(int floor) {
        if(floor > 10 || floor < 1) {
            System.out.println("invalid selection..");
            return;
        }

        elevatorRequestPublisher.notifyElevators(floor);
    }
}

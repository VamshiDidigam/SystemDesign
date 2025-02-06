package org.example;

public class Main {
    public static void main(String[] args) {
        /**
         * Questions?
         * 1. Multiple elevators system or single elevator system?
         * 2. Single control for all elevators or individual controller?
         * 3. when I press up/down, should all the lifts act or the nearest one
         */
        // Create elevator request publisher with a strategy
        ElevatorAssignmentStrategy strategy = new NearestElevatorStrategy();
        ElevatorController elevatorController = new ElevatorController(3, strategy);

        elevatorController.requestElevator(1);
        elevatorController.requestElevator(2);
        elevatorController.requestElevator(3);
    }
}
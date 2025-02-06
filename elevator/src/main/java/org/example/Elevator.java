package org.example;

import java.util.Collections;
import java.util.PriorityQueue;

public class Elevator implements ElevatorObserver{
    int id;
    int currFloor;
    Direction direction;
    PriorityQueue<Request> upQueue = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Request> downQueue = new PriorityQueue<>();

    Elevator(int id, int currFloor) {
        this.id=id;
        this.currFloor = currFloor;
        this.direction = Direction.IDLE;
    }



    void addRequest(int floor) {
        if(floor > currFloor) {
            upQueue.add(new Request(floor, Direction.UP));
        } else {
            downQueue.add(new Request(floor, Direction.DOWN));
        }
    }

    void move() {
        while(!upQueue.isEmpty() || !downQueue.isEmpty()) {
            if(!upQueue.isEmpty()) {
                Request request = upQueue.poll();
                currFloor = request.floor;
                direction = Direction.UP;
            } else if(!downQueue.isEmpty()){
                Request request = downQueue.poll();
                currFloor = request.floor;
                direction = Direction.DOWN;
            } else {
                direction = Direction.IDLE;
            }
        }
    }

    @Override
    public void acceptRequest(int floor) {
        System.out.println(" selected elevator: " + this.id);
        addRequest(floor);
    }
}

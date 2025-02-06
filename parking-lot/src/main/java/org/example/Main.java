package org.example;

import org.example.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("PL-001");

        // Add floors to the parking lot
        parkingLot.addFloor(new ParkingFloor("F1", 2, 2, 1));
        parkingLot.addFloor(new ParkingFloor("F2", 3, 3, 2));

        // Park a car and generate a ticket
        Vehicle car = new Vehicle("CAR123", VehicleType.CAR) {};
        ParkingSlot carSlot = parkingLot.parkVehicle(car);
        Ticket carTicket = new Ticket("TICKET1", carSlot.getSlotId(), car.getVehicleNumber());
        System.out.println("Car parked at slot: " + carSlot.getSlotId());
        System.out.println("Ticket generated: " + carTicket.getTicketId() + ", Entry Time: " + carTicket.getEntryTime());

        // Simulate some parking time
        LocalDateTime entryTime = carTicket.getEntryTime();
        LocalDateTime exitTime = entryTime.plusHours(3); // Simulate 3 hours of parking

        // Calculate payment during unparking
        double fee = Payment.calculateFee(entryTime, exitTime, car.getVehicleType());
        System.out.println("Parking fee: ₹" + fee);

        // Unpark the car using the ticket
        parkingLot.unparkVehicle(carTicket.getSlotId());
        System.out.println("Car unparked from slot: " + carTicket.getSlotId());
    }
}

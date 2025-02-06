package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class Payment {
    public static double calculateFee(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType vehicleType) {
        long hours = Duration.between(entryTime, exitTime).toHours();
        if (hours == 0) hours = 1; // Minimum charge for 1 hour
        switch (vehicleType) {
            case BIKE:
                return hours * 10; // ₹10/hour for bikes
            case CAR:
                return hours * 20; // ₹20/hour for cars
            case TRUCK:
                return hours * 50; // ₹50/hour for trucks
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}

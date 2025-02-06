package org.example;

import java.util.Map;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String parkingLotId;
    private List<ParkingFloor> parkingFloors;

    public ParkingLot(String parkingLotId) {
        this.parkingLotId = parkingLotId;
        this.parkingFloors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        parkingFloors.add(floor);
    }

    public ParkingSlot parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : parkingFloors) {
            ParkingSlot slot = floor.findAvailableSlot(vehicle.getVehicleType());
            if (slot != null) {
                slot.assignVehicle(vehicle);
                return slot;
            }
        }
        throw new RuntimeException("No available slot for vehicle type: " + vehicle.getVehicleType());
    }

    public void unparkVehicle(String slotId) {
        for (ParkingFloor floor : parkingFloors) {
            for (ParkingSlot slot : floor.parkingSlots) {
                if (slot.getSlotId().equals(slotId)) {
                    slot.removeVehicle();
                    return;
                }
            }
        }
        throw new RuntimeException("Slot ID not found: " + slotId);
    }
}

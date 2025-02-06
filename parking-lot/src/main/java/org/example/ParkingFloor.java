package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private String floorId;
    List<ParkingSlot> parkingSlots;

    public ParkingFloor(String floorId, int bikeSlots, int carSlots, int truckSlots) {
        this.floorId = floorId;
        this.parkingSlots = new ArrayList<>();
        for (int i = 0; i < bikeSlots; i++) {
            parkingSlots.add(new ParkingSlot(floorId + "-B-" + i, VehicleType.BIKE));
        }
        for (int i = 0; i < carSlots; i++) {
            parkingSlots.add(new ParkingSlot(floorId + "-C-" + i, VehicleType.CAR));
        }
        for (int i = 0; i < truckSlots; i++) {
            parkingSlots.add(new ParkingSlot(floorId + "-T-" + i, VehicleType.TRUCK));
        }
    }

    public ParkingSlot findAvailableSlot(VehicleType vehicleType) {
        for (ParkingSlot slot : parkingSlots) {
            if (slot.isAvailable() && slot.canFitVehicle(new Vehicle("", vehicleType) {})) {
                return slot;
            }
        }
        return null;
    }

    public String getFloorId() {
        return floorId;
    }
}


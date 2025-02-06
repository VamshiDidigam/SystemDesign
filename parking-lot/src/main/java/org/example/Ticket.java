package org.example;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private String slotId;
    private String vehicleNumber;
    private LocalDateTime entryTime;

    public Ticket(String ticketId, String slotId, String vehicleNumber) {
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.vehicleNumber = vehicleNumber;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}

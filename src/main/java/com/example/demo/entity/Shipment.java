package com.example.demo.entity;

import java.time.LocalDate;

public class Shipment {
    private long id;
    private Vehicle vechicle;
    private Location pickUpLocation;
    private Location dropLocation;
    private Double weightKg;
    private LocalDate scheduledDate;

    public Shipment(){}

    public Shipment(Vehicle vechicle, Location pickUpLocation, Location dropLocation, Double weightKg,
            LocalDate scheduledDate) {
        this.vechicle = vechicle;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.weightKg = weightKg;
        this.scheduledDate = scheduledDate;
    }

    public long getId() {
        return id;
    }

    public Vehicle getVechicle() {
        return vechicle;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVechicle(Vehicle vechicle) {
        this.vechicle = vechicle;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
    
}

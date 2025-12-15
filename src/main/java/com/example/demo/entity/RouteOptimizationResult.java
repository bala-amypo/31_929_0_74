package com.example.demo.entity;

import java.time.LocalDateTime;

public class RouteOptimizationResult {
    private long id;
    private Shipment shipment;
    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;
    private LocalDateTime genereatedAt;

    public RouteOptimizationResult(){}

    public RouteOptimizationResult(Shipment shipment, Double optimizedDistanceKm, Double estimatedFuelUsageL,
            LocalDateTime genereatedAt) {
        this.shipment = shipment;
        this.optimizedDistanceKm = optimizedDistanceKm;
        this.estimatedFuelUsageL = estimatedFuelUsageL;
        this.genereatedAt = genereatedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public void setOptimizedDistanceKm(Double optimizedDistanceKm) {
        this.optimizedDistanceKm = optimizedDistanceKm;
    }

    public void setEstimatedFuelUsageL(Double estimatedFuelUsageL) {
        this.estimatedFuelUsageL = estimatedFuelUsageL;
    }

    public void setGenereatedAt(LocalDateTime genereatedAt) {
        this.genereatedAt = genereatedAt;
    }

    public long getId() {
        return id;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public Double getOptimizedDistanceKm() {
        return optimizedDistanceKm;
    }

    public Double getEstimatedFuelUsageL() {
        return estimatedFuelUsageL;
    }

    public LocalDateTime getGenereatedAt() {
        return genereatedAt;
    }
    

}

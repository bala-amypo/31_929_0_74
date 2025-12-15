package com.example.demo.entity;

public class RouteOptimizationResult {
    private long id;
    private Shipment shipment;
    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;
    private LocalDateTime genereatedAt;

    public RouteOptimizationResult(){}
}

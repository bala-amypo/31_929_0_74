package com.example.demo.service;

import com.example.demo.entity.Vehicle;

public interface VehicleService {
    Vehicle addVehicle(Long userId,Vehicle vehicle);
    List<Vehicle> getVehiclesByUsers(Long userId);
    Vehicle findById(Long id);
}

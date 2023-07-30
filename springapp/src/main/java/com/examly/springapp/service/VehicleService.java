//package com.example.login.service;
package com.examly.springapp.service;


import com.examly.springapp.model.Vehicle;
import com.examly.springapp.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
//import com.example.demo.model.Vehicle;
//import com.example.demo.repository.VehicleRepo;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
//import com.example.demo.controller.VehicleController;
//import com.example.demo.service.VehicleService;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehiclerepo;

    public List<Vehicle> getVehicleAll(){
        return vehiclerepo.findAll();
    }

    public Vehicle bookVehicle(Vehicle vehicles){
        return vehiclerepo.save(vehicles);
    }

    public Vehicle getVehicleById(Long vehicleId){
        return vehiclerepo.findById(vehicleId).get();
    }

    public Vehicle saveVehicle(Long vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));

        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleCity(vehicledetails.getVehicleCity());
        vehicle.setVehicleUrl(vehicledetails.getVehicleUrl());
        vehicle.setVehiclePrice(vehicledetails.getVehiclePrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());
        return vehiclerepo.save(vehicle);
    }


    public Vehicle editVehicle(Long vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));

        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleCity(vehicledetails.getVehicleCity());
        vehicle.setVehicleUrl(vehicledetails.getVehicleUrl());
        vehicle.setVehiclePrice(vehicledetails.getVehiclePrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());

        return vehiclerepo.save(vehicle);
    }

    public void deleteVehicle(Long vehicleId) {
        vehiclerepo.deleteById(vehicleId);
    }

}
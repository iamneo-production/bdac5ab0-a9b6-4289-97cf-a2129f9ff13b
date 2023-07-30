<<<<<<< HEAD
//package com.example.login.service;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
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

<<<<<<< HEAD
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
=======
    public Optional<Vehicle> getVehicleById(String vehicleId){
        return vehiclerepo.findById(vehicleId);
    }

    public Vehicle saveVehicle(String vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));
        vehicle.setVehicleID(vehicledetails.getVehicleID());
        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleAddress(vehicledetails.getVehicleAddress());
        vehicle.setVehicleImageURL(vehicledetails.getVehicleImageURL());
        vehicle.setPrice(vehicledetails.getPrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());
        vehicle.setVehicleAvailableStatus(vehicledetails.getVehicleAvailableStatus());

>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
        return vehiclerepo.save(vehicle);
    }


<<<<<<< HEAD
    public Vehicle editVehicle(Long vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));

        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleCity(vehicledetails.getVehicleCity());
        vehicle.setVehicleUrl(vehicledetails.getVehicleUrl());
        vehicle.setVehiclePrice(vehicledetails.getVehiclePrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());
=======
    public Vehicle editVehicle(String vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));
        vehicle.setVehicleID(vehicledetails.getVehicleID());
        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleAddress(vehicledetails.getVehicleAddress());
        vehicle.setVehicleImageURL(vehicledetails.getVehicleImageURL());
        vehicle.setPrice(vehicledetails.getPrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());
        vehicle.setVehicleAvailableStatus(vehicledetails.getVehicleAvailableStatus());
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14

        return vehiclerepo.save(vehicle);
    }

<<<<<<< HEAD
    public void deleteVehicle(Long vehicleId) {
=======
    public void deleteVehicle(String vehicleId) {
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
        vehiclerepo.deleteById(vehicleId);
    }

}
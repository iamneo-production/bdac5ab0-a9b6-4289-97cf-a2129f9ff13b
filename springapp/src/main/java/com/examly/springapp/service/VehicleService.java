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

    public Optional<Vehicle> getVehicleById(Long vehicleId){
        return vehiclerepo.findById(vehicleId);
    }

    public Vehicle saveVehicle(Long vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));

        vehicle.setVehicleId(vehicledetails.getVehicleId());
        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleAddress(vehicledetails.getVehicleAddress());
        vehicle.setVehicleImageURL(vehicledetails.getVehicleImageURL());
        vehicle.setPrice(vehicledetails.getPrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());
        vehicle.setVehicleAvailableStatus(vehicledetails.getVehicleAvailableStatus());

        return vehiclerepo.save(vehicle);
    }


    public Vehicle editVehicle(Long vehicleId, Vehicle vehicledetails){
        Vehicle vehicle=vehiclerepo.findById(vehicleId).orElseThrow(() -> new NoSuchElementException("Vehicle does not exist with id : "+vehicleId));

        vehicle.setVehicleId(vehicledetails.getVehicleId());
        vehicle.setVehicleName(vehicledetails.getVehicleName());
        vehicle.setVehicleAvailableTiming(vehicledetails.getVehicleAvailableTiming());
        vehicle.setVehicleAddress(vehicledetails.getVehicleAddress());
        vehicle.setVehicleImageURL(vehicledetails.getVehicleImageURL());
        vehicle.setPrice(vehicledetails.getPrice());
        vehicle.setVehicleCapacity(vehicledetails.getVehicleCapacity());
        vehicle.setVehicleDescription(vehicledetails.getVehicleDescription());
        vehicle.setVehicleAvailableStatus(vehicledetails.getVehicleAvailableStatus());

        return vehiclerepo.save(vehicle);
    }

    public void deleteVehicle(Long vehicleId) {
        vehiclerepo.deleteById(vehicleId);
    }

}

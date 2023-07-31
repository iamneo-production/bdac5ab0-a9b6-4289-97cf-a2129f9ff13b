
package com.examly.springapp.repository;

import com.examly.springapp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//import com.example.demo.model.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
    public Vehicle findByVehicleId(Long vehicleID);
}

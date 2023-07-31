<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.repository;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.repository;

import com.examly.springapp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.demo.model.Vehicle;

@Repository
<<<<<<< HEAD
<<<<<<< HEAD
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

=======
public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    public Vehicle findByVehicleID(String vehicleID);
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
    public Vehicle findByVehicleId(Long vehicleID);
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
}

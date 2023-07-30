<<<<<<< HEAD
//package com.example.login.controller;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
package com.examly.springapp.controller;

import javax.persistence.Entity;
import java.util.List;

import com.examly.springapp.model.Vehicle;
<<<<<<< HEAD
=======
import com.examly.springapp.dtomodels.VehicleTestDTO;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
import com.examly.springapp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam; 
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
import java.util.Optional;
//import com.example.demo.model.Vehicle;
//import com.example.demo.service.VehicleService;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping

public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/admin/vehicle")
    public List<Vehicle> getVehicleAll(){
        return vehicleService.getVehicleAll();
    }

    @PostMapping("/admin/addVehicle")
    public ResponseEntity <Vehicle> bookVehicle( @RequestBody Vehicle vehicles){
        Vehicle booked = vehicleService.bookVehicle(vehicles);
        return new ResponseEntity<Vehicle>(booked, HttpStatus.CREATED);
        //return vehicleService.saveVehicle(vehicles);
    }
<<<<<<< HEAD

    @GetMapping("/admin/vehicle/{vehicleId}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long vehicleId){
        Vehicle data=vehicleService.getVehicleById(vehicleId);
        return new ResponseEntity<Vehicle>(data,HttpStatus.CREATED);
=======
    

    @GetMapping("/admin/vehicle/{vehicleId}")
    public Optional<Vehicle> getVehicleById(@PathVariable String vehicleId){
        return vehicleService.getVehicleById(vehicleId);
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
    }

    @PostMapping("/admin/saveVehicle")
    public ResponseEntity <Vehicle> saveVehicle( @RequestBody Vehicle vehicledetails){
        Vehicle saved = vehicleService.bookVehicle(vehicledetails);
        return new ResponseEntity<Vehicle>(saved, HttpStatus.CREATED);
        //return vehicleService.saveVehicle(vehicledetails);
    }

    @PutMapping("/admin/editVehicle/{vehicleId}")
<<<<<<< HEAD
    public Vehicle editVehicle(@PathVariable Long vehicleId,@RequestBody Vehicle vehicledetails){

        return vehicleService.editVehicle(vehicleId,vehicledetails);
    }

    @DeleteMapping("/admin/deleteVehicle/{vehicleId}")
    public void deleteVehicle(@PathVariable Long vehicleId) {
        vehicleService.deleteVehicle(vehicleId);
    }

=======
    public Vehicle editVehicle(@PathVariable String vehicleId,@RequestBody Vehicle vehicledetails){
        return vehicleService.editVehicle(vehicleId,vehicledetails);
    }

    
    @DeleteMapping("/admin/deleteVehicle/{vehicleId}")
    public void deleteVehicle(@PathVariable String vehicleId) {
        vehicleService.deleteVehicle(vehicleId);
    }

    @PostMapping("/admin/addProduct")
    public Vehicle addVehicle( @RequestBody Vehicle vehicle){
        //Vehicle booked = 
        return vehicleService.bookVehicle(vehicle);
        //return vehicleService.saveVehicle(vehicles);
    }
    
    @PutMapping("/admin/productEdit")
    public Vehicle editVehicleById(@RequestParam("vehicleID") String vehicleID,@RequestBody Vehicle vehicle){

        return vehicleService.editVehicle(vehicleID,vehicle);
    }

    @GetMapping("/admin")
    public List<Vehicle> getAllVehicle(){
        return vehicleService.getVehicleAll();
    }

>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
//    @Bean
//    public WebMvcConfigurer crosConfigurer(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/*").allowedHeaders("*");
//            }
//        };
//    }

}

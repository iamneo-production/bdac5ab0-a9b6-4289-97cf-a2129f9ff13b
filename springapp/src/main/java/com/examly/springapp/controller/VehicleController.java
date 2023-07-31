<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.controller;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.controller;

import javax.persistence.Entity;
import java.util.List;

import com.examly.springapp.model.Vehicle;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.examly.springapp.dtomodels.VehicleTestDTO;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
import com.examly.springapp.dtomodels.VehicleTestDTO;
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam; 
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
import org.springframework.web.bind.annotation.RequestParam; 
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
=======
    

    @GetMapping("/admin/vehicle/{vehicleId}")
    public Optional<Vehicle> getVehicleById(@PathVariable Long vehicleId){
        System.out.println(vehicleId.getClass());
        //long vehicleId = Long.parseLong(id);
        return vehicleService.getVehicleById(vehicleId);
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    }

    @PostMapping("/admin/saveVehicle")
    public ResponseEntity <Vehicle> saveVehicle( @RequestBody Vehicle vehicledetails){
        Vehicle saved = vehicleService.bookVehicle(vehicledetails);
        return new ResponseEntity<Vehicle>(saved, HttpStatus.CREATED);
        //return vehicleService.saveVehicle(vehicledetails);
    }

    @PutMapping("/admin/editVehicle/{vehicleId}")
<<<<<<< HEAD
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
=======
    public Vehicle editVehicle(@PathVariable Long vehicleId,@RequestBody Vehicle vehicledetails){
        System.out.println(vehicleId.getClass());
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        return vehicleService.editVehicle(vehicleId,vehicledetails);
    }

    
    @DeleteMapping("/admin/deleteVehicle/{vehicleId}")
<<<<<<< HEAD
    public void deleteVehicle(@PathVariable String vehicleId) {
=======
    public void deleteVehicle(@PathVariable Long vehicleId) {
        System.out.println(vehicleId.getClass());
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        vehicleService.deleteVehicle(vehicleId);
    }

    @PostMapping("/admin/addProduct")
    public Vehicle addVehicle( @RequestBody Vehicle vehicle){
        //Vehicle booked = 
        return vehicleService.bookVehicle(vehicle);
        //return vehicleService.saveVehicle(vehicles);
    }
    
    @PutMapping("/admin/productEdit")
<<<<<<< HEAD
    public Vehicle editVehicleById(@RequestParam("vehicleID") String vehicleID,@RequestBody Vehicle vehicle){

=======
    public Vehicle editVehicleById(@RequestParam("vehicleID") Long vehicleID,@RequestBody Vehicle vehicle){
        System.out.println(vehicleID.getClass());
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        return vehicleService.editVehicle(vehicleID,vehicle);
    }

    @GetMapping("/admin")
    public List<Vehicle> getAllVehicle(){
        return vehicleService.getVehicleAll();
    }

<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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

<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.controller;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.controller;

import com.examly.springapp.model.Passenger;
import com.examly.springapp.service.PassengerService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
import java.util.List;

>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

@CrossOrigin(origins ="*")
@RestController
@RequestMapping
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
<<<<<<< HEAD
<<<<<<< HEAD
    @PostMapping("/user/addpassenger")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger){
        Passenger savedBooking = passengerService.addPassenger(passenger);
        return new ResponseEntity<Passenger>(savedBooking, HttpStatus.CREATED);
    }

=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

    @PostMapping("/user/addpassenger")
    public ResponseEntity<?> createPassenger(@RequestBody List<Passenger> entity) {

        //System.out.println(entity.toString());
        ResponseEntity<?> passengerEntity = passengerService.CreatePassenger(entity);
       // System.out.println("passengerEntity:" + passengerEntity);

        return passengerEntity;
}
    @DeleteMapping("/user/deletepassenger/{bookingid}")
    public void deleteEntities(@PathVariable("bookingid") Long bookingid) {
        passengerService.deleteEntitiesById(bookingid);
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
//                registry.addMapping("/*").allowedHeaders("*").allowedOrigins("http://localhost:4200");
//            }
//        };
//    }
}

//package com.example.login.controller;
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

@CrossOrigin(origins ="*")
@RestController
@RequestMapping
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    @PostMapping("/user/addpassenger")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger){
        Passenger savedBooking = passengerService.addPassenger(passenger);
        return new ResponseEntity<Passenger>(savedBooking, HttpStatus.CREATED);
    }

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

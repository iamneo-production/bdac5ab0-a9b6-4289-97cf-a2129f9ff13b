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
import java.util.List;


@CrossOrigin(origins ="*")
@RestController
@RequestMapping
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

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

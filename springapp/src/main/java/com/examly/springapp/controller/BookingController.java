package com.examly.springapp.controller;


import com.examly.springapp.model.Booking;
import com.examly.springapp.service.BookingService;

import java.util.List;
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
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/user/addbooking")
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
        System.out.println(booking);
        Booking savedBooking = bookingService.addBooking(booking);
        return new ResponseEntity<Booking>(savedBooking, HttpStatus.CREATED);
    }
    @GetMapping("/user/booking")
    public List<Booking> getAllBooking(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/user/booking/{bookingid}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("bookingid") long bookingid){
        return new ResponseEntity<Booking>(bookingService.getBookingDetailsId(bookingid), HttpStatus.OK);
    }
    @GetMapping("/user/userbooking/{userid}")
    public List<Booking> getBookingByUserId(@PathVariable("userid") long userid){
        return bookingService.getBookingDetailsUserId(userid);
    }
    @PutMapping("/user/editbooking/{bookingid}")
    public ResponseEntity<Booking> editBooking(@PathVariable("bookingid") long bookingid,@RequestBody Booking booking){
        return new ResponseEntity<Booking>(bookingService.editBooking(booking, bookingid), HttpStatus.OK);
    }
    @PostMapping("/user/savebooking/{bookingid}")
    public ResponseEntity<Booking> updateBooking(@PathVariable("bookingid") long bookingid,@RequestBody Booking booking){
        return new ResponseEntity<Booking>(bookingService.updateBooking(booking, bookingid), HttpStatus.OK);
    }

    @DeleteMapping("/user/deletebooking/{bookingid}")
    public void deleteBooking(@PathVariable("bookingid") long bookingid){
        bookingService.deleteBooking(bookingid);

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

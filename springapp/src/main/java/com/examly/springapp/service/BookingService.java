//package com.example.login.service;
package com.examly.springapp.service;


import com.examly.springapp.model.Booking;
import com.examly.springapp.repository.BookingRepository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepo;

    public List<Booking> getAllBookings(){
        return bookingRepo.findAll();
    }
    public Booking addBooking(Booking booking) {
        return bookingRepo.save(booking);
    }
    public Booking getBookingDetailsId(long bookingid) {
        return bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException("Booking does not exist with id : "+bookingid));
    }
    public List<Booking> getBookingDetailsUserId(long userid) {
        try{
            return bookingRepo.findAllByUserId(userid);
        } catch (Exception e){
            throw  new NoSuchElementException("Booking does not exist with id : "+userid);
        }
//        .orElseThrow(() ->
    }
    public Booking editBooking(Booking booking, long bookingid) {

        Booking booking1=bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException("Booking does not exist with id : "+bookingid));

        booking1.setBoatName(booking.getBoatName());
        booking1.setAddress(booking.getAddress());
        booking1.setNoOfPersons(booking.getNoOfPersons());
        booking1.setFromDate(booking.getFromDate());
        booking1.setToDate(booking.getToDate());
        booking1.setTotalPrice(booking.getTotalPrice());
//        booking1.settPrice(booking.gettPrice());
        bookingRepo.save(booking1);
        return booking1;

    }
    public Booking updateBooking(Booking booking, long bookingid) {

        Booking booking1=bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException("Booking does not exist with id : "+bookingid));

        booking1.setBoatName(booking.getBoatName());
        booking1.setAddress(booking.getAddress());
        booking1.setNoOfPersons(booking.getNoOfPersons());
        booking1.setFromDate(booking.getFromDate());
        booking1.setToDate(booking.getToDate());
        booking1.setTotalPrice(booking.getTotalPrice());
        //booking1.settPrice(booking.gettPrice());
        bookingRepo.save(booking1);
        return booking1;

    }
    public void deleteBooking(long bookingid) {


        bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException());
        bookingRepo.deleteById(bookingid);
    }

}
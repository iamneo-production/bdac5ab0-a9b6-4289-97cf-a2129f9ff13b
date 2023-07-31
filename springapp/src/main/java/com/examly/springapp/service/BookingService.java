<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.service;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.service;


import com.examly.springapp.model.Booking;
import com.examly.springapp.repository.BookingRepository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
<<<<<<< HEAD
<<<<<<< HEAD
        return bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException("Booking does not exist with id : "+bookingid));
=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        Booking b1=bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException("Booking does not exist with id : "+bookingid));
        System.out.println(b1.getTotalPrice());
        System.out.println(b1.getTotalPrice().getClass());
        return b1;
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
        booking1.setStartTime(booking.getStartTime());
        booking1.setEndTime(booking.getEndTime());
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
        booking1.setStartTime(booking.getStartTime());
        booking1.setEndTime(booking.getEndTime());
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
        booking1.setStartTime(booking.getStartTime());
        booking1.setEndTime(booking.getEndTime());
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
        booking1.setStartTime(booking.getStartTime());
        booking1.setEndTime(booking.getEndTime());
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        booking1.setTotalPrice(booking.getTotalPrice());
        //booking1.settPrice(booking.gettPrice());
        bookingRepo.save(booking1);
        return booking1;

    }
    public void deleteBooking(long bookingid) {

<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        bookingRepo.findById(bookingid).orElseThrow(() -> new NoSuchElementException());
        bookingRepo.deleteById(bookingid);
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4


package com.examly.springapp.service;

import com.examly.springapp.model.Passenger;
import com.examly.springapp.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.util.NoSuchElementException;

@Service
@Transactional
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepo;

    public ResponseEntity<?> CreatePassenger(List<Passenger> entity) {

        List<Passenger> passengerlist = new ArrayList<>();
        try {
            passengerlist = passengerRepo.saveAll(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NoSuchElementException("something went Wrong");
        }
        return new ResponseEntity<>(passengerlist, HttpStatus.OK);
    }

    public void deleteEntitiesById(Long bookingid) {
        passengerRepo.deleteBybookingId(bookingid);
	}
}

//package com.example.login.service;
package com.examly.springapp.service;

import com.examly.springapp.model.Passenger;
import com.examly.springapp.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepo;
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepo.save(passenger);
    }
}

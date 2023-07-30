//package com.example.login.repository;
package com.examly.springapp.repository;


import com.examly.springapp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}

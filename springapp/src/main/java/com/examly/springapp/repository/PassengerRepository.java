package com.examly.springapp.repository;


import com.examly.springapp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    public Passenger findByPassengerId(Long passengerId);

    void deleteBybookingId(Long passengerid);

    // List<Passenger> saveAll(List<Passenger> entity);
}

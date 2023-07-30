<<<<<<< HEAD
//package com.example.login.repository;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
package com.examly.springapp.repository;


import com.examly.springapp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {

=======
@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    public Passenger findByPassengerId(Long passengerId);

    void deleteBybookingId(Long passengerid);

    // List<Passenger> saveAll(List<Passenger> entity);
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
}

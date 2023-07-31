<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.repository;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.repository;


import com.examly.springapp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
<<<<<<< HEAD

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {

=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    public Passenger findByPassengerId(Long passengerId);

    void deleteBybookingId(Long passengerid);

    // List<Passenger> saveAll(List<Passenger> entity);
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
}

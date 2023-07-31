<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.repository;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.repository;



import com.examly.springapp.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {


    List<Booking> findAllByUserId(long userid);
<<<<<<< HEAD
}
=======
}
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

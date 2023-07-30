<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.repository;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
package com.examly.springapp.repository;

import com.examly.springapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

<<<<<<< HEAD
<<<<<<< HEAD
    public User findUserByEmailId(String emailId);
//    boolean existsUserByEmail(String email);
    boolean existsUserByEmailId(String email);
=======
=======
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
    public User findUserByEmail(String email);
//    boolean existsUserByEmail(String email);
    //boolean existsUserByEmailId(String email);
    boolean existsUserByEmail(String email);
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6

}

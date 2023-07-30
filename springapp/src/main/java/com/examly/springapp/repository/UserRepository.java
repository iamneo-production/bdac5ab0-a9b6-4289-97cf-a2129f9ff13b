<<<<<<< HEAD
//package com.example.login.repository;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
package com.examly.springapp.repository;

import com.examly.springapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

<<<<<<< HEAD
    public User findUserByEmailId(String emailId);
//    boolean existsUserByEmail(String email);
    boolean existsUserByEmailId(String email);
=======
    public User findUserByEmail(String email);
//    boolean existsUserByEmail(String email);
    //boolean existsUserByEmailId(String email);
    boolean existsUserByEmail(String email);
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14

}

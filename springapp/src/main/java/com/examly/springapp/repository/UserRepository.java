//package com.example.login.repository;
package com.examly.springapp.repository;

import com.examly.springapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findUserByEmailId(String emailId);
//    boolean existsUserByEmail(String email);
    boolean existsUserByEmailId(String email);

}

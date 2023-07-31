<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.service;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
package com.examly.springapp.service;

import com.examly.springapp.model.User;
import com.examly.springapp.dtomodels.CustomUserDetails;
import com.examly.springapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    public UserRepository userRepository;

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {

        User user =this.userRepository.findUserByEmailId(emailId);
=======
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user =this.userRepository.findUserByEmail(email);
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user =this.userRepository.findUserByEmail(email);
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
        if (user==null){
            throw new UsernameNotFoundException("User Not Found!");
        }
        else {
            return new CustomUserDetails(user);
        }
    }
}

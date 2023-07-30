//package com.example.login.service;
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
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {

        User user =this.userRepository.findUserByEmailId(emailId);
        if (user==null){
            throw new UsernameNotFoundException("User Not Found!");
        }
        else {
            return new CustomUserDetails(user);
        }
    }
}

package com.examly.springapp.controller;

import com.examly.springapp.model.User;
import com.examly.springapp.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin(origins = "*")
@RestController
public class ProfileController {

    @Autowired
    ProfileService pS;

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User user=pS.getUserById(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PutMapping("/updateProfile/{id}")
    public User updateProfile(@PathVariable long id,@RequestBody User user){
        user.setId(id);
        System.out.println(user.toString());
        return pS.updateProfile(user);
    }

//    @Bean
//    public WebMvcConfigurer crosConfigurer(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/*").allowedHeaders("*");
//            }
//        };
//    }

}


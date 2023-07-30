<<<<<<< HEAD
//package com.example.login.service;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
package com.examly.springapp.service;

import com.examly.springapp.model.User;
import com.examly.springapp.dtomodels.ProfileModel;
import com.examly.springapp.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public User getUserById(long id){
        return profileRepository.findById(id).get();
    }
    public User updateProfile(User user){

        return profileRepository.save(user);
    }

}

package com.examly.springapp.service;

import com.examly.springapp.model.User;
import com.examly.springapp.dtomodels.LoginModel;
import com.examly.springapp.dtomodels.UserModel;
import com.examly.springapp.dtomodels.UserTestDTO;
import com.examly.springapp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Locale;


@Service
@Slf4j //used for displaying log
public class AuthService {
    @Autowired
    UserRepository userRepository;

    public boolean bool;
    public int len;
    public String p;
    public String e;

    public String saveUser(UserTestDTO userTestDTO){
        boolean emailAlreadyExists = userRepository.existsUserByEmail(userTestDTO.getEmail());
        if(emailAlreadyExists){
            return ("Sorry, Email already exists!. Try using different emailId.");

        }
        try {
            userRepository.save(populateUser(userTestDTO));
            return ("User created successfully");
        } catch (Exception e) {
            return ("User creation failed. Try Again");
        }

    }
    public String saveAdmin(UserTestDTO userTestDTO){
        boolean emailAlreadyExists = userRepository.existsUserByEmail(userTestDTO.getEmail());
        if(emailAlreadyExists){
            return ("Sorry, Email already exists!. Try using different emailId.");
        }
        try {
            userRepository.save(populateUser(userTestDTO));
            return ("User created successfully");
        } catch (Exception e) {
            return ("User creation failed. Try Again");
        }
    }
    public String saveDetails(UserTestDTO userTestDTO){
        boolean emailAlreadyExists = userRepository.existsUserByEmail(userTestDTO.getEmail());
        if(emailAlreadyExists){
            return ("Sorry, Email already exists!. Try using different emailId.");
        }
        try {
            userRepository.save(populateUserTest(userTestDTO));
            return ("User created successfully");
        } catch (Exception e) {
            return ("User creation failed. Try Again");
        }
    }

    protected User populateUserTest(UserTestDTO userTestDTO){
        User user =new User();
        user.setUsername(userTestDTO.getUsername());
        user.setUserRole(userTestDTO.getUserRole());
        user.setPassword(userTestDTO.getPassword());
        user.setMobileNumber(userTestDTO.getMobileNumber());
        user.setEmail(userTestDTO.getEmail());
        return user;
    }
    
    protected User populateUser(UserTestDTO userTestDTO){
        User user =new User();
        user.setUsername(userTestDTO.getUsername());
        user.setUserRole(userTestDTO.getUserRole());
        user.setPassword(userTestDTO.getPassword());
        user.setMobileNumber(userTestDTO.getMobileNumber());
        user.setEmail(userTestDTO.getEmail());
        return user;
    }

    public boolean isUserPresent(LoginModel loginModel){
        String email= loginModel.getEmailId();
        String password= loginModel.getPassword();
//        String userRole=loginModel.getUserRole().toLowerCase();
//        log.info(password);

        try{
            User u1 = userRepository.findUserByEmail(email);
//            p=u1.getPassword();
//            e=u1.getEmailId();
//            log.info(u1.getPassword().getClass().getSimpleName());
//            len=u1.getPassword().length();
//            System.out.println(u1.getPassword().getClass().getSimpleName());
            if(!u1.equals(null)){
                String x=u1.getUserRole().toLowerCase();
//                if(x.equals(userRole)){
                    bool=u1.getPassword().equals(password);
//                    System.out.println(bool);
                    return bool;
//                }
//                return false;
            }
        }
        catch (Exception e){
            log.info("Error while Logging customer",e.getMessage());
            return false;
        }
        return false;
    }

    public boolean isAdminPresent(LoginModel loginModel){
        String email= loginModel.getEmailId();
        String password= loginModel.getPassword();
//        String userRole=loginModel.getUserRole().toLowerCase();
        try{
            User u2 = userRepository.findUserByEmail(email);
            len=u2.getPassword().length();
            if(!u2.equals(null)){
                String x=u2.getUserRole().toLowerCase();
//                if(x.equals(userRole)){
                    bool=u2.getPassword().equals(password);
                    System.out.println(bool);
                    return bool;
//                }

//                return false;
            }
        }
        catch (Exception e){
            log.info("Error while Logging admin",e.getMessage());
            return false;
        }
        return false;
    }

    public long getid(LoginModel loginModel){
        String email= loginModel.getEmailId();
        String password= loginModel.getPassword();
//        String userRole=loginModel.getUserRole().toLowerCase();
            User u3 = userRepository.findUserByEmail(email);
//            len=u2.getPassword().length();
            if(!u3.equals(null)) {
                String x = u3.getUserRole().toLowerCase();
//                if (x.equals(userRole)) {
                    bool = u3.getPassword().equals(password);
//                    System.out.println(bool);
                    if (bool == true)
                        return u3.getId();
                }else return -1;
//            }else return -1;
        return -1;
    }

}

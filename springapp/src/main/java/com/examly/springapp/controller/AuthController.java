package com.examly.springapp.controller;

import com.examly.springapp.dtomodels.LoginModel;
import com.examly.springapp.dtomodels.UserModel;
import com.examly.springapp.dtomodels.UserTestDTO;
import com.examly.springapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/user/signup")
    public String saveUser(@RequestBody @Valid UserTestDTO userTestDTO){
        return authService.saveUser(userTestDTO);
    }
    @PostMapping("/admin/signup")
    public String saveAdmin(@RequestBody @Valid UserTestDTO userTestDTO){
        return authService.saveAdmin(userTestDTO);
    }

    @PostMapping("/signup")
    public String saveDetails(@RequestBody @Valid UserTestDTO userTestDTO){
        return authService.saveDetails(userTestDTO);
    }

    @PostMapping("/user/login")
    public boolean isUserPresent(@RequestBody LoginModel loginModel){

//        System.out.println(loginModel);
//        System.out.println(loginModel.getPassword().length());
//        System.out.println(authService.len);
//        System.out.println(authService.p);
//        System.out.println(authService.e);
//        System.out.println(authService.bool);
        return authService.isUserPresent(loginModel);
    }
    @PostMapping("/admin/login")
    public boolean isAdminPresent(@RequestBody LoginModel loginModel){
//        System.out.println(loginModel);
//        System.out.println(loginModel.getPassword().length());
//        System.out.println(authService.len);
//        System.out.println(authService.bool);
        return authService.isAdminPresent(loginModel);
    }

    @PostMapping("/getid")
    public long getid(@RequestBody LoginModel loginModel){
        return authService.getid(loginModel);
    }

}

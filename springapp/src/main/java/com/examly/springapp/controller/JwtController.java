<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.controller;
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
//import com.example.SpringSecurity.Helper.JwtUtil;
//import com.example.SpringSecurity.Model.JwtRequest;
//import com.example.SpringSecurity.Model.JwtResponse;
//import com.example.SpringSecurity.Service.CustomUserDetailsService;
<<<<<<< HEAD
=======

>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
package com.examly.springapp.controller;
import com.examly.springapp.helper.JwtUtil;
import com.examly.springapp.model.User;
import com.examly.springapp.dtomodels.JwtResponse;
import com.examly.springapp.dtomodels.LoginModel;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody LoginModel loginModel) throws Exception {
        System.out.println("Jwt Controller: "+ loginModel);
        try{
            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginModel.getEmailId(),loginModel.getPassword()));
        }
        catch (UsernameNotFoundException e){
            e.printStackTrace();
            throw new UsernameNotFoundException("Bad Credentials");
        }
        UserDetails userDetails =this.customUserDetailsService.loadUserByUsername(loginModel.getEmailId());
        String token =jwtUtil.generateToken(userDetails);
        System.out.println("JWT "+token);
<<<<<<< HEAD
        final User user = userRepository.findUserByEmailId(loginModel.getEmailId());
=======
        final User user = userRepository.findUserByEmail(loginModel.getEmailId());
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
        return ResponseEntity.ok( new JwtResponse(token, user));
    }
}

=======
//import com.example.SpringSecurity.Helper.JwtUtil;
//import com.example.SpringSecurity.Model.JwtRequest;
//import com.example.SpringSecurity.Model.JwtResponse;
//import com.example.SpringSecurity.Service.CustomUserDetailsService;

package com.examly.springapp.controller;
import com.examly.springapp.helper.JwtUtil;
import com.examly.springapp.model.User;
import com.examly.springapp.dtomodels.JwtResponse;
import com.examly.springapp.dtomodels.LoginModel;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody LoginModel loginModel) throws Exception {
        System.out.println("Jwt Controller: "+ loginModel);
        try{
            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginModel.getEmailId(),loginModel.getPassword()));
        }
        catch (UsernameNotFoundException e){
            e.printStackTrace();
            throw new UsernameNotFoundException("Bad Credentials");
        }
        UserDetails userDetails =this.customUserDetailsService.loadUserByUsername(loginModel.getEmailId());
        String token =jwtUtil.generateToken(userDetails);
        System.out.println("JWT "+token);
        final User user = userRepository.findUserByEmail(loginModel.getEmailId());
        return ResponseEntity.ok( new JwtResponse(token, user));
    }
}

>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

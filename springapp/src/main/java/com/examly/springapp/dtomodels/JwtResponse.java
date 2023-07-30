<<<<<<< HEAD
//package com.example.login.model;

=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
package com.examly.springapp.dtomodels;

import com.examly.springapp.model.User;
import lombok.*;

@Data
public class JwtResponse {
    String token;

    public JwtResponse() {
    }

    public JwtResponse(String token, User user) {
        this.token = token;
        this.user = user;
    }

    User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

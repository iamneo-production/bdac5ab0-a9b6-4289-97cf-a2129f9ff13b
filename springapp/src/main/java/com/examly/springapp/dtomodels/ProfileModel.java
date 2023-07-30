//package com.example.login.model;
package com.examly.springapp.dtomodels;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileModel {


    private long id;
    private String userName;
    private String emailId;
    private String password;
    private String mobileNumber;
    private String userRole;
    private String dob;
    private String gender;
    private String fname;
    private String lname;
}

// import javax.persistence.Entity;
package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;

    private String emailId;

    private String password;
    private String confirmPassword;

    private String mobileNumber;

    private String userRole;
    private String dOB;
    private String gender;
    private String fname;
    private String lname;



    public User(){

    }

    public User(String userName, String emailId,String password,String cpassword,String mobileNumber,String userRole,String dOB,String gender,String fname,String lname){
        super();
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.userRole = userRole;
        this.dOB=dOB;
        this.gender=gender;
        this.fname=fname;
        this.lname=lname;
    }


}

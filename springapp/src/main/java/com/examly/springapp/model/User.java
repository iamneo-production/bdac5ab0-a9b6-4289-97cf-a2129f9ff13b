<<<<<<< HEAD
// import javax.persistence.Entity;
package com.examly.springapp.model;

=======
package com.examly.springapp.model;


>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
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

<<<<<<< HEAD
    private String userName;

    private String emailId;
=======
    private String username;

    private String email;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14

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

<<<<<<< HEAD
    public User(String userName, String emailId,String password,String cpassword,String mobileNumber,String userRole,String dOB,String gender,String fname,String lname){
        super();
        this.userName = userName;
        this.emailId = emailId;
=======
    public User(String username, String email,String password,String mobileNumber,String userRole,String dOB,String gender,String fname,String lname){
        super();
        this.username = username;
        this.email = email;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.userRole = userRole;
        this.dOB=dOB;
        this.gender=gender;
        this.fname=fname;
        this.lname=lname;
    }

<<<<<<< HEAD

}
=======
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14

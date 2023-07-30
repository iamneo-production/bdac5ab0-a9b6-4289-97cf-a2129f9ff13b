//package com.example.login.model;
package com.examly.springapp.dtomodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private long id;

    @NotBlank(message = "Invalid User Name: Empty User Name")
//    @Size(min = 3, max = 30, message = "Invalid User Name: Must be of 3 - 30 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]{4,12}$", message = "Username must be of 4 to 12 length with no special characters.")
    private String userName;

    @Email(message = "Invalid emailId")
    private String emailId;

    @NotNull
    @Size(min = 2, max = 30)
    private String password;
    private String cpassword;

    @NotBlank(message = "Invalid Phone number: Empty number")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    private String mobileNumber;

    @NotBlank(message = "User Role is Empty")
    @Size(min = 4, max = 5, message = "Please enter user role as admin or user")
    private String userRole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }



}

<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.entity;
package com.examly.springapp.model;

=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
package com.examly.springapp.model;



<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "passdetails")
public class Passenger {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private Long passengerId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "booking_id")
    private Long bookingId;

<<<<<<< HEAD
<<<<<<< HEAD
    public Passenger() {
    }

    public Passenger(Long passengerId, String firstName, String lastName, int age, String gender, Long bookingId) {
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
        this.bookingId = bookingId;
    }

    public Long getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
}
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
}
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
//    public String getG() {
//        return g;
//    }
//
//    public void setG(String g) {
//        this.g = g;
//    }
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

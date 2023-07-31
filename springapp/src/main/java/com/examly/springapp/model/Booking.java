package com.examly.springapp.model;

<<<<<<< HEAD
<<<<<<< HEAD
=======



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
@Table(name = "bookingdetails")
public class Booking {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "booking_id")

    private Long bookingId;

    @Column(name = "boat_name")

    private String boatName;


    @Column(name = "address")

    private String address;

    @Column(name = "no_of_persons")

    private String noOfPersons;

    @Column(name = "from_date")
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    private String fromDate;

    @Column(name = "to_date")
    private String toDate;

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    @Column(name = "from_time")
    private String startTime;

    @Column(name = "to_time")
    private String endTime;

<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    @Column(name = "total_price")
    private String totalPrice;

    @Column(name = "user_id")
    private Long userId;
    @Column(name = "vehicle_id")
    private Long vehicleId;

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======

>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
//    private String tPrice;
//
//    public String gettPrice() {
//        return tPrice;
//    }
//
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
//    public void settPrice(String tPrice) {
//        this.tPrice = tPrice;
//    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(String noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }


<<<<<<< HEAD
<<<<<<< HEAD
}

=======
}
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
}
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

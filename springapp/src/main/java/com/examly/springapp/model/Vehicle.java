<<<<<<< HEAD
//package com.example.login.entity;
package com.examly.springapp.model;

=======
package com.examly.springapp.model;


>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name = "vehicledetails")

public class Vehicle {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private Long vehicleId;

    @NotEmpty
    @Size(min=5, message = "Vehicle name should have atleast 5 characters")
    @Column(name = "vehicle_name")
    private String vehicleName;

    @NotEmpty(message = "Vehicle available timing is required")
=======
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private String vehicleID;

    // @NotEmpty
    // @Size(min=5, message = "Vehicle name should have atleast 5 characters")
    @Column(name = "vehicle_name")
    private String vehicleName;

    // @NotEmpty(message = "Vehicle available timing is required")
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
    @Column(name = "vehicle_availabletiming")
    private String vehicleAvailableTiming;

    @Column(name = "vehicle_city")
<<<<<<< HEAD
    private String vehicleCity;

    @Column(name = "vehicle_url")
    private String vehicleUrl;

    @Column(name = "vehicle_price")
    private String vehiclePrice;

=======
    private String vehicleAddress;

    @Column(name = "vehicle_url")
    private String vehicleImageURL;

    @Column(name = "vehicle_price")
    private String price;

    private String vehicleAvailableStatus;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14


    @Column(name = "vehicle_capacity")
    private String vehicleCapacity;

    @Column(name = "vehicle_description")
    private String vehicleDescription;

<<<<<<< HEAD
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
=======

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleAvailableTiming() {
        return vehicleAvailableTiming;
    }

    public void setVehicleAvailableTiming(String vehicleAvailableTiming) {
        this.vehicleAvailableTiming = vehicleAvailableTiming;
    }

<<<<<<< HEAD
    public String getVehicleCity() {
        return vehicleCity;
    }

    public void setVehicleCity(String vehicleCity) {
        this.vehicleCity = vehicleCity;
    }

    public String getVehicleUrl() {
        return vehicleUrl;
    }

    public void setVehicleUrl(String vehicleUrl) {
        this.vehicleUrl = vehicleUrl;
    }

    public String getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(String vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
=======
    public String getVehicleAddress() {
        return vehicleAddress;
    }

    public void setVehicleAddress(String vehicleAddress) {
        this.vehicleAddress = vehicleAddress;
    }

    public String getVehicleImageURL() {
        return vehicleImageURL;
    }

    public void setVehicleImageURL(String vehicleImageURL) {
        this.vehicleImageURL = vehicleImageURL;
    }

    public String getVehicleAvailableStatus() {
        return vehicleAvailableStatus;
    }

    public void setVehicleAvailableStatus(String vehicleAvailableStatus) {
        this.vehicleAvailableStatus = vehicleAvailableStatus;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
    }

    public String getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(String vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
<<<<<<< HEAD
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleAvailableTiming='" + vehicleAvailableTiming + '\'' +
                ", vehicleCity='" + vehicleCity + '\'' +
                ", vehicleUrl='" + vehicleUrl + '\'' +
                ", vehiclePrice='" + vehiclePrice + '\'' +
=======
                "vehicleId=" + vehicleID +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleAvailableTiming='" + vehicleAvailableTiming + '\'' +
                ", vehicleCity='" + vehicleAddress + '\'' +
                ", vehicleUrl='" + vehicleImageURL + '\'' +
                ", vehiclePrice='" + price + '\'' +
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
                ", vehicleCapacity='" + vehicleCapacity + '\'' +
                ", vehicleDescription='" + vehicleDescription + '\'' +
                '}';
    }
}
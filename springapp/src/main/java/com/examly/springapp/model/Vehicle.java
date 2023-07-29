package com.examly.springapp.model;


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
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private String vehicleID;

    // @NotEmpty
    // @Size(min=5, message = "Vehicle name should have atleast 5 characters")
    @Column(name = "vehicle_name")
    private String vehicleName;

    // @NotEmpty(message = "Vehicle available timing is required")
    @Column(name = "vehicle_availabletiming")
    private String vehicleAvailableTiming;

    @Column(name = "vehicle_city")
    private String vehicleAddress;

    @Column(name = "vehicle_url")
    private String vehicleImageURL;

    @Column(name = "vehicle_price")
    private String price;

    private String vehicleAvailableStatus;


    @Column(name = "vehicle_capacity")
    private String vehicleCapacity;

    @Column(name = "vehicle_description")
    private String vehicleDescription;


    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
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
                "vehicleId=" + vehicleID +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleAvailableTiming='" + vehicleAvailableTiming + '\'' +
                ", vehicleCity='" + vehicleAddress + '\'' +
                ", vehicleUrl='" + vehicleImageURL + '\'' +
                ", vehiclePrice='" + price + '\'' +
                ", vehicleCapacity='" + vehicleCapacity + '\'' +
                ", vehicleDescription='" + vehicleDescription + '\'' +
                '}';
    }
}
<<<<<<< HEAD
<<<<<<< HEAD
//package com.example.login.entity;
package com.examly.springapp.model;

=======
package com.examly.springapp.model;


>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
package com.examly.springapp.model;


>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
<<<<<<< HEAD
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private Long vehicleId;

<<<<<<< HEAD
    @NotEmpty
    @Size(min=5, message = "Vehicle name should have atleast 5 characters")
    @Column(name = "vehicle_name")
    private String vehicleName;

    @NotEmpty(message = "Vehicle available timing is required")
=======
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private String vehicleID;

=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    // @NotEmpty
    // @Size(min=5, message = "Vehicle name should have atleast 5 characters")
    @Column(name = "vehicle_name")
    private String vehicleName;

    // @NotEmpty(message = "Vehicle available timing is required")
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    @Column(name = "vehicle_availabletiming")
    private String vehicleAvailableTiming;

    @Column(name = "vehicle_city")
<<<<<<< HEAD
<<<<<<< HEAD
    private String vehicleCity;

    @Column(name = "vehicle_url")
    private String vehicleUrl;

    @Column(name = "vehicle_price")
    private String vehiclePrice;

=======
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    private String vehicleAddress;

    @Column(name = "vehicle_url")
    private String vehicleImageURL;

    @Column(name = "vehicle_price")
    private String price;

    private String vehicleAvailableStatus;
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4


    @Column(name = "vehicle_capacity")
    private String vehicleCapacity;

    @Column(name = "vehicle_description")
    private String vehicleDescription;

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
<<<<<<< HEAD
=======

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
<<<<<<< HEAD
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
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
=======
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleAvailableTiming='" + vehicleAvailableTiming + '\'' +
                ", vehicleCity='" + vehicleAddress + '\'' +
                ", vehicleUrl='" + vehicleImageURL + '\'' +
                ", vehiclePrice='" + price + '\'' +
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
                ", vehicleCapacity='" + vehicleCapacity + '\'' +
                ", vehicleDescription='" + vehicleDescription + '\'' +
                '}';
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4

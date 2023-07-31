
package com.examly.springapp.dtomodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data

public class VehicleTestDTO {

    private String vehicleID;
    private String vehicleName;
    private String vehicleAvailableTiming;
    private String vehicleAddress;
    private String vehicleImageURL;
    private String price;
    private String vehicleAvailableStatus;
    private String vehicleCapacity;
    private String vehicleDescription;

    public VehicleTestDTO() {
    }

    public VehicleTestDTO(String vehicleID, String vehicleName, String vehicleAvailableTiming, String vehicleAddress, String vehicleImageURL, String price, String vehicleCapacity, String vehicleDescription, String vehicleAvailableStatus) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleAvailableTiming = vehicleAvailableTiming;
        this.vehicleAddress = vehicleAddress;
        this.vehicleImageURL = vehicleImageURL;
        this.price = price;
        this.vehicleCapacity = vehicleCapacity;
        this.vehicleDescription = vehicleDescription;
        this.vehicleAvailableStatus=vehicleAvailableStatus;
    }

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

    // public String getVehicleUrl() {
    //     return vehicleUrl;
    // }

    // public void setVehicleUrl(String vehicleUrl) {
    //     this.vehicleUrl = vehicleUrl;
    //}

    // public String getVehiclePrice() {
    //     return vehiclePrice;
    // }

    // public void setVehiclePrice(String vehiclePrice) {
    //     this.vehiclePrice = vehiclePrice;
    // }

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
    public String getVehicleImageURL() {
        return vehicleImageURL;
    }

    public void setVehicleImageURL(String vehicleImageURL) {
        this.vehicleImageURL = vehicleImageURL;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVehicleAvailableStatus() {
        return vehicleAvailableStatus;
    }

    public void setVehicleAvailableStatus(String vehicleAvailableStatus) {
        this.vehicleAvailableStatus = vehicleAvailableStatus;
    }
}

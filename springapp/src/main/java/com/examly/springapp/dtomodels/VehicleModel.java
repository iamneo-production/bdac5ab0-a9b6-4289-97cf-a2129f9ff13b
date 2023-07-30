//package com.example.login.model;
package com.examly.springapp.dtomodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data

public class VehicleModel {

    private Long vehicleId;
    private String vehicleName;
    private String vehicleAvailableTiming;
    private String vehicleCity;
    private String vehicleUrl;
    private String vehiclePrice;
    private String vehicleCapacity;
    private String vehicleDescription;

    public VehicleModel() {
    }

    public VehicleModel(Long vehicleId, String vehicleName, String vehicleAvailableTiming, String vehicleCity, String vehicleUrl, String vehiclePrice, String vehicleCapacity, String vehicleDescription) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleAvailableTiming = vehicleAvailableTiming;
        this.vehicleCity = vehicleCity;
        this.vehicleUrl = vehicleUrl;
        this.vehiclePrice = vehiclePrice;
        this.vehicleCapacity = vehicleCapacity;
        this.vehicleDescription = vehicleDescription;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
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
}

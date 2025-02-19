package com.example.unit6.model;

import jakarta.persistence.*;

//Food Service
@Entity
@Table(name = "inventory") 
public class inventory {
    //ingrediantID, ingrediantName, requiredStock, currentStock, restockStatus
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingrediantID;

    private String ingrediantName;

    private Integer requiredStock;

    private Integer currentStock;

    private Boolean restockStatus;

    //getters and setters
    public Long getIngrediantID() {
        return ingrediantID;
    }
    public void setIngrediantID(Long ingrediantID) {
        this.ingrediantID = ingrediantID;
    }
    public String getIngrediantName() {
        return ingrediantName;
    }
    public void setIngrediantName(String ingrediantName) {
        this.ingrediantName = ingrediantName;
    }
    public Integer getRequiredStock() {
        return requiredStock;
    }
    public void setRequiredStock(Integer requiredStock) {
        this.requiredStock = requiredStock;
    }
    public Integer getCurrentStock() {
        return currentStock;
    }
    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }
    public Boolean getRestockStatus() {
        return restockStatus;
    }
    public void setRestockStatus(Boolean restockStatus) {
        this.restockStatus = restockStatus;
    }
    
}

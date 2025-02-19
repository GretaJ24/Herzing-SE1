package com.example.unit6.model;

import jakarta.persistence.*;
//Food Service
@Entity
@Table(name = "menu")
public class menu {
    //menuItemID, itemName, itemPrice, category, itemDescription
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuItemID;

    private String itemName;

    private Double itemPrice;

    private String category;

    private String itemDescription;

    //getters and setters
    public Long getMenuItemID() {
        return menuItemID;
    }
    public void setMenuItemID(Long menuItemID) {
        this.menuItemID = menuItemID;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}

package com.example.unit6.model;
import jakarta.persistence.*;

//Table Service
@Entity
@Table(name = "orderDetails")
public class orderDetails {
    //detailID, orderID, menuItemID, quantity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailID;

    private Long orderID;

    private Long menuItemID;

    private Integer quantity;

    //getters and setters
    public Long getDetailID() {
        return detailID;
    }
    public void setDetailID(Long detailID) {
        this.detailID = detailID;
    }
    public Long getOrderID() {
        return orderID;
    }
    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }
    public Long getMenuItemID() {
        return menuItemID;
    }
    public void setMenuItemID(Long menuItemID) {
        this.menuItemID = menuItemID;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

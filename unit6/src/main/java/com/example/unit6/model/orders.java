package com.example.unit6.model;

import jakarta.persistence.*;

//Table Service
@Entity
@Table(name = "orders")
public class orders {
    //orderID, tableID, orderStatus, totalPrice
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;

    private Long tableID;

    private String orderStatus;

    private Double totalPrice;

    //getters and setters
    public Long getOrderID() {
        return orderID;
    }
    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }
    public Long getTableID() {
        return tableID;
    }
    public void setTableID(Long tableID) {
        this.tableID = tableID;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

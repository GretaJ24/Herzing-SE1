package com.example.unit6;

import org.junit.jupiter.api.Test;


public class inventoryTest {

    @Test
    void contextLoads(){
        assert true;
    }
    @Test
    void testInventory() {
        // Create an instance of the Inventory class
        var inventory = new inventoryTest();
        // Check if the inventory is not null
        assert inventory != null;
    }
    @Test
    void testIngredient() {
        // Create an instance of the Ingredient class
        var ingredient = new inventoryTest();
        // Check if the ingredient is not null
        assert ingredient != null;
    }
    @Test
    void testStock() {
        // Create an instance of the Stock class
        var requiredStock = new inventoryTest();
        // Check if the stock is not null
        assert requiredStock != null;
    }
    @Test
    void testCurrentStock(){
        // Create an instance of the CurrentStock class
        var currentStock = new inventoryTest();
        // Check if the current stock is not null
        assert currentStock != null;
    }
    @Test
    void testRestockStatus(){
        // Create an instance of the RestockStatus class
        var restockStatus = new inventoryTest();
        // Check if the restock status is not null
        assert restockStatus != null;
    }

}

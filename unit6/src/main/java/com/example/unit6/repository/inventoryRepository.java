package com.example.unit6.repository;

import com.example.unit6.model.inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Food Service
@Repository
public interface inventoryRepository extends JpaRepository<inventory, Long> {
}

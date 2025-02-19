package com.example.unit6.repository;

import com.example.unit6.model.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Table Service
@Repository
public interface orderRepository extends JpaRepository<orders, Long> {
}


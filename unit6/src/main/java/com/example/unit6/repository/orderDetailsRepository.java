package com.example.unit6.repository;

import com.example.unit6.model.orderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Table Service
@Repository
public interface orderDetailsRepository extends JpaRepository<orderDetails, Long> {
}

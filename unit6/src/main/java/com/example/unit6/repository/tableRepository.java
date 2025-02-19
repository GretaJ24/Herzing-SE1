package com.example.unit6.repository;

import com.example.unit6.model.tables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Table Service
@Repository
public interface tableRepository extends JpaRepository<tables, Long> {
}
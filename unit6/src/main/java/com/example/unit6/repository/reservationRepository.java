package com.example.unit6.repository;

//Front Service

import com.example.unit6.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reservationRepository 
extends JpaRepository<reservations, Long>{}
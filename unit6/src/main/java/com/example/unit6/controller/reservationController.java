package com.example.unit6.controller;

import com.example.unit6.model.reservations;
import com.example.unit6.repository.reservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/reservations")
public class reservationController {
    private final reservationRepository reservationRepository;

    @Autowired
    public reservationController(reservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public String listReservations(Model model) {
        model.addAttribute("reservations", reservationRepository.findAll());
        return "reservations/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("reservations", new reservations());
        return "reservations/create";
    }

    @PostMapping
    public String createReservation(@ModelAttribute("reservations") reservations reservations){
        reservationRepository.save(reservations);
        return "redirect:/reservations";
    }
    @GetMapping("/edit/{reservationID}")
    public String showEditForm(@PathVariable("reservationID") Long reservationID, Model model){
        model.addAttribute("reservations", reservationRepository.findById(reservationID).orElseThrow(() ->
                new IllegalArgumentException("Invalid reservation Id:" + reservationID)));
        return "reservations/edit"; 
    }
    @PostMapping("/update/{reservationID}")
    public String updateReservation(@PathVariable("reservationID")Long reservationID, @ModelAttribute("reservations") reservations reservation){
        reservation.setReservationID(reservationID);
        reservationRepository.save(reservation);
        return "redirect:/reservations";
    }
    @GetMapping("/delete/{reservationID}")
    public String deleteReservation(@PathVariable("reservationID") Long reservationID){
        reservationRepository.deleteById(reservationID);
        return "redirect:/reservations";
    }
}

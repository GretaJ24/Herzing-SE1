package com.example.unit6.controller;

import com.example.unit6.model.orderDetails;
import com.example.unit6.repository.orderDetailsRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Table Service
@Controller
@RequestMapping("/orderDetails")
public class orderDetailsController {
    private final orderDetailsRepository orderDetailsRepository;

    //@Autowired
    public orderDetailsController(orderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }
    @GetMapping
    public String listOrderDetails(Model model) {
        model.addAttribute("orderDetails", orderDetailsRepository.findAll());
        return "orderDetails/list";
    }
    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("orderDetails", new orderDetails());
        return "orderDetails/create";
    }
    @PostMapping
    public String createOrderDetails(@ModelAttribute("orderDetails") orderDetails orderDetails){
        orderDetailsRepository.save(orderDetails);
        return "redirect:/orderDetails";
    }
    @GetMapping("/edit/{orderDetailsID}")
    public String showEditForm(@PathVariable("detailID") Long detailsID, Model model){
        model.addAttribute("orderDetails", orderDetailsRepository.findById(detailsID).orElseThrow(() ->
                new IllegalArgumentException("Invalid orderDetails Id:" + detailsID)));
        return "orderDetails/edit";
    }
    @PostMapping("/update/{detailsID}")
    public String updateOrderDetails(@PathVariable("detailID")Long detailsID, @ModelAttribute("details") orderDetails orderDetails){
        orderDetails.setDetailID(detailsID);
        orderDetailsRepository.save(orderDetails);
        return "redirect:/orderDetails";
    }
    @GetMapping("/delete/{orderDetailsID}")
    public String deleteOrderDetails(@PathVariable("detailID") Long detailID){
        orderDetailsRepository.deleteById(detailID);
        return "redirect:/orderDetails";
    }

}

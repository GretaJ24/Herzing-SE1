package com.example.unit6.controller;

import com.example.unit6.model.orders;
import com.example.unit6.repository.orderRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Table Service
@Controller
@RequestMapping("/orders")
public class orderController {
    private final orderRepository orderRepository;

    //@Autowired
    public orderController(orderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @GetMapping
    public String listOrders(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        return "orders/list";
    }
    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("orders", new orders());
        return "orders/create";
    }
    @PostMapping
    public String createOrder(@ModelAttribute("orders") orders orders){
        orderRepository.save(orders);
        return "redirect:/orders";
    }
    @GetMapping("/edit/{orderID}")
    public String showEditForm(@PathVariable("orderID") Long orderID, Model model){
        model.addAttribute("orders", orderRepository.findById(orderID).orElseThrow(() ->
                new IllegalArgumentException("Invalid order Id:" + orderID)));
        return "orders/edit";
    }
    @PostMapping("/update/{orderID}")
    public String updateOrder(@PathVariable("orderID")Long orderID, @ModelAttribute("orders") orders order){
        order.setOrderID(orderID);
        orderRepository.save(order);
        return "redirect:/orders";
    }
    @GetMapping("/delete/{orderID}")
    public String deleteOrder(@PathVariable("orderID") Long orderID){
        orderRepository.deleteById(orderID);
        return "redirect:/orders";
    }
}

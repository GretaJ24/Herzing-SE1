package com.example.unit6.controller;

import com.example.unit6.model.inventory;
import com.example.unit6.repository.inventoryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Food Service
@Controller
@RequestMapping("/inventory")
public class inventoryController {
    private final inventoryRepository inventoryRepository;

    //@Autowired
    public inventoryController(inventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }
    @GetMapping
    public String listInventory(Model model) {
        model.addAttribute("inventory", inventoryRepository.findAll());
        return "inventory/list";
    }
    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("inventory", new inventory());
        return "inventory/create";
    }
    @PostMapping
    public String createInventory(@ModelAttribute("inventory") inventory inventory){
        inventoryRepository.save(inventory);
        return "redirect:/inventory";
    }
    @GetMapping("/edit/{ingrediantID}")
    public String showEditForm(@PathVariable("ingrediantID") Long ingrediantID, Model model){
        model.addAttribute("inventory", inventoryRepository.findById(ingrediantID).orElseThrow(() ->
                new IllegalArgumentException("Invalid inventory Id:" + ingrediantID)));
        return "inventory/edit";
    }
    @PostMapping("/update/{ingrediantID}")
    public String updateInventory(@PathVariable("ingrediantID")Long ingrediantID, @ModelAttribute("inventory") inventory inventory){
        inventory.setIngrediantID(ingrediantID);
        inventoryRepository.save(inventory);
        return "redirect:/inventory";
    }
    @GetMapping("/delete/{ingrediantID}")
    public String deleteInventory(@PathVariable("ingrediantID") Long ingrediantID){
        inventoryRepository.deleteById(ingrediantID);
        return "redirect:/inventory";
    } 
}

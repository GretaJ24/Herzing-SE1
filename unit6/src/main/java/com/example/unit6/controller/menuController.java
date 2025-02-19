package com.example.unit6.controller;

import com.example.unit6.model.menu;
import com.example.unit6.repository.menuRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Food Service
@Controller
@RequestMapping("/menu")
public class menuController {
    private final menuRepository menuRepository;

    //@Autowired
    public menuController(menuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }
    @GetMapping
    public String listMenu(Model model) {
        model.addAttribute("menu", menuRepository.findAll());
        return "menu/list";
    }
    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("menu", new menu());
        return "menu/create";
    }
    @PostMapping
    public String createMenu(@ModelAttribute("menu") menu menu){
        menuRepository.save(menu);
        return "redirect:/menu";
    }
    @GetMapping("/edit/{menuItemID}")
    public String showEditForm(@PathVariable("menuItemID") Long menuItemID, Model model){
        model.addAttribute("menu", menuRepository.findById(menuItemID).orElseThrow(() ->
                new IllegalArgumentException("Invalid menu Id:" + menuItemID)));
        return "menu/edit";
    }
    @PostMapping("/update/{menuItemID}")
    public String updateMenu(@PathVariable("menuItemID")Long menuItemID, @ModelAttribute("menu") menu menu){
        menu.setMenuItemID(menuItemID);
        menuRepository.save(menu);
        return "redirect:/menu";
    }
    @GetMapping("/delete/{menuItemID}")
    public String deleteMenu(@PathVariable("menuItemID") Long menuItemID){
        menuRepository.deleteById(menuItemID);
        return "redirect:/menu";
    }

}

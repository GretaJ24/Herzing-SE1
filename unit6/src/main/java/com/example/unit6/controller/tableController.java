package com.example.unit6.controller;

import com.example.unit6.model.tables;
import com.example.unit6.repository.tableRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Table Service
@Controller
@RequestMapping("/tables")
public class tableController {
    private final tableRepository tableRepository;

    //@Autowired
    public tableController(tableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }
    @GetMapping
    public String listTables(Model model) {
        model.addAttribute("tables", tableRepository.findAll());
        return "tables/list";
    }
    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("tables", new tables());
        return "tables/create";
    }
    @PostMapping
    public String createTables(@ModelAttribute("tables") tables tables){
        tableRepository.save(tables);
        return "redirect:/tables";
    }
    @GetMapping("/edit/{tableID}")
    public String showEditForm(@PathVariable("tableID") Long tableID, Model model){
        model.addAttribute("tables", tableRepository.findById(tableID).orElseThrow(() ->
                new IllegalArgumentException("Invalid table Id:" + tableID)));
        return "tables/edit";
    }
    @PostMapping("/update/{tableID}")
    public String updateTables(@PathVariable("tableID")Long tableID, @ModelAttribute("tables") tables tables){
        tables.setTableID(tableID);
        tableRepository.save(tables);
        return "redirect:/tables";
    }
    @GetMapping("/delete/{tableID}")
    public String deleteTables(@PathVariable("tableID") Long tableID){
        tableRepository.deleteById(tableID);
        return "redirect:/tables";
    }

}

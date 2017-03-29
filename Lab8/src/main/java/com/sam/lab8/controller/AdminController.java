/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.lab8.controller;

import com.sam.lab8.entity.ClassModel;
import com.sam.lab8.entity.Module;
import com.sam.lab8.entity.PersonModel;
import com.sam.lab8.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Afk..HCM
 */
@Controller
public class AdminController {
    @Autowired
    ModuleRepository moduleRepository;
    @RequestMapping(value = "/admin")
    public String adminPage() {
//        generateData();
        return "admin";
    }
    @RequestMapping(value = "/list-module")
    public String listPage() {
        return "admin";
    }
    private void generateData() {
        Module m = new Module();
        m.setName("AJ");
        m.setClassModel(new ClassModel("SE123",2,6,4));
        m.setPersonModel(new PersonModel("SE123",2,6,4));
        moduleRepository.save(m);
        m = new Module();
        m.setName("XML");
        m.setClassModel(new ClassModel("SE113",3,6,3));
        m.setPersonModel(new PersonModel("SE113",3,6,3));
        moduleRepository.save(m);
    }
}

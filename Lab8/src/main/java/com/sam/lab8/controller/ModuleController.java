/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.lab8.controller;

import com.sam.lab8.entity.ClassModel;
import com.sam.lab8.entity.IssueModel;
import com.sam.lab8.entity.Module;
import com.sam.lab8.entity.PersonModel;
import com.sam.lab8.repository.ModuleRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Afk..HCM
 */
@RestController
@RequestMapping(value = "/api")
public class ModuleController {

    @Autowired
    private ModuleRepository moduleRepository;

    @GetMapping(value = "/genarate")
    public void genarateData() {
        PersonModel p = new PersonModel();
        p.setName("Class");
        p.setRelease(3);
        p.setRunning(40);
        p.setTotal(45);

        ClassModel c = new ClassModel();
        c.setName("Class");
        c.setRelease(3);
        c.setRunning(40);
        c.setTotal(40);
        List<IssueModel> issueModels = new ArrayList<IssueModel>();
        IssueModel i = new IssueModel();
        i.setId(0);
        i.setName("Di Tre");
        issueModels.add(i);

        Module m = new Module();
        m.setClassModel(c);
        m.setIssueModel(issueModels);
        m.setName("Fresher");
        m.setPersonModel(p);

        moduleRepository.save(m);
    }

    @GetMapping(value = "/module", produces = "application/json")
    public @ResponseBody
    List<Module> findAll() {
        return moduleRepository.findAll();
    }

    @PostMapping(value = "/module", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    int addModule(@RequestBody Module module) {
        try {
            moduleRepository.save(module);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @DeleteMapping(value = "/module/{id}")
    public int deleteModule(@PathVariable(name = "id") String id) {
        try {
            moduleRepository.delete(id);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @PutMapping(value = "/module", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    int editModule(@RequestBody Module module) {
        try {
            moduleRepository.save(module);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping(value = "/redirect/add")
    public ModelAndView redirectAdd() {
        ModelAndView modelAndView = new ModelAndView("AddModule");
        modelAndView.addObject("ADDFORM", new Module());
        return modelAndView;
    }

    @GetMapping(value = "/redirect/edit/{id}")
    public ModelAndView redirectEdit(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("EditModule");
        Module module = moduleRepository.findOne(id);
        modelAndView.addObject("ADDFORM", module);
        return modelAndView;
    }

    @DeleteMapping(value = "/module/del/{id}", consumes = "application/json")
    public @ResponseBody
    int delModule(String id) {
        try {
            moduleRepository.delete(id);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}

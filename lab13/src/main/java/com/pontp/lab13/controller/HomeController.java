/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.controller;

import com.google.gson.Gson;
import com.pontp.lab13.entity.Tour;
import com.pontp.lab13.service.TourService;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
public class HomeController {

    @Autowired
    private TourService tourService;
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "index";
    }

//    @RequestMapping(value = "/tour/getAll", method = RequestMethod.GET, produces = {"application/json; charset=UTF-8"})
//    @ResponseBody
//    public String getAllEmployee() throws JSONException, UnsupportedEncodingException {
//        System.out.println("Go Homeeeeeeeeeeeeeeeeeee");
//        List<Tour> list = tourService.getAllTour();
//        System.out.println("length :" + list.size());
//        String json = new Gson().toJson(list);
////      response.setContentType("application/json;charset=UTF-8");
//        System.out.println("json:" + json);
////      JSONObject reader = new JSONObject(json);
//        return json;
//    }

}

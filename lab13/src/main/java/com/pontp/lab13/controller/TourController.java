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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
@RequestMapping(value="/tour")
public class TourController {
    @Autowired
    TourService tourService;
    
    
    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { "application/json; charset=UTF-8" })
    @ResponseBody
    public String getAll(HttpServletRequest request, HttpServletResponse response) throws JSONException, UnsupportedEncodingException
    {  
        List<Tour> tours = tourService.getAllTour();
        String json = new Gson().toJson(tours);
        response.setContentType("application/json;charset=UTF-8");
        System.out.println("json:" + json);
        return json;
    }
    
}

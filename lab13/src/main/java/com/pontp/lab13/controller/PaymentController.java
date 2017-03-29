/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.controller;

import com.google.gson.Gson;
import com.pontp.lab13.entity.Payment;
import com.pontp.lab13.service.PaymentService;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
@RequestMapping(value="/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
     
    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    @ResponseBody
    public String addPayment(@RequestBody Payment payment) throws JSONException, UnsupportedEncodingException
    {  
        String result;
        if (paymentService.savePayment(payment))
            result= "true";
        else result= "false";
        return result;
    }
    @RequestMapping(value = "/getPaymentsByName", method = RequestMethod.GET)
    @ResponseBody
    public String getPaymentByPaymentId(HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "name") String name
    ) throws JSONException, UnsupportedEncodingException
    {
        List<Payment> payments = paymentService.getPaymentsByName(name);
        String json = new Gson().toJson(payments);
        response.setContentType("application/json;charset=UTF-8");
        System.out.println("json:" + json);
        return json;
    }
}

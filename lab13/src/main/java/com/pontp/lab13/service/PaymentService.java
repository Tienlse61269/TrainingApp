/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.service;

import com.pontp.lab13.controller.HomeController;
import com.pontp.lab13.entity.Payment;
import com.pontp.lab13.repository.IPaymentRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author asus
 */
@Service
public class PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);
    @Autowired
    IPaymentRepository IPaymentRepository;
      @Transactional
    public boolean savePayment(Payment payment){
        try {
              IPaymentRepository.save(payment);
              return true;
          } catch (Exception e) {
              logger.error("Error Save Account",e);
          }
       return false;
    }     
    public Payment getPayment(int id){
        return IPaymentRepository.getOne(id);
    }
    
    public List<Payment> getPaymentsByName(String name){
        return IPaymentRepository.getPaymentsByName(name);
    }
    
    @Transactional
    public boolean delete(Payment payment){
         try {
              IPaymentRepository.delete(payment);
              return true;
          } catch (Exception e) {
              logger.error("Error Save Account",e);
          }
       return false;
    }
    @Transactional
    public void setRepository(IPaymentRepository IpaymentRepository) {
        this.IPaymentRepository = IpaymentRepository;
    }
    @Transactional
    public List<Payment> getAllPayment(){
        return IPaymentRepository.findAll();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.repository;

import com.pontp.lab13.entity.Payment;
import com.pontp.lab13.entity.Tour;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author asus
 */
public interface IPaymentRepository  extends JpaRepository<Payment, Integer>{
  @Query(value="select * from payment where name=?",nativeQuery = true)
  List<Payment> getPaymentsByName (String name);
}

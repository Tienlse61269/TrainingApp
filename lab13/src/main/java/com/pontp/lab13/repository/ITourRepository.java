/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.repository;



import com.pontp.lab13.entity.Tour;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Afk..Po
 */
public interface ITourRepository extends JpaRepository<Tour, Integer>{
//public interface ITourRepository{  
    
}

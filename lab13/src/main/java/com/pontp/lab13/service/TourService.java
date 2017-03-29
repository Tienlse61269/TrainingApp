/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.service;

import com.pontp.lab13.entity.Tour;
import com.pontp.lab13.repository.ITourRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Afk..HCM
 */
@Service
public class TourService {
    @Autowired
    private ITourRepository ITourRepository;
    
    @Transactional
    public void saveTour(Tour tour){
        ITourRepository.save(tour);
    }     
    public Tour getTour(int id){
        return ITourRepository.getOne(id);
    }
    @Transactional
    public void delete(Tour tour){
         ITourRepository.delete(tour);
    }
    @Transactional
    public void setRepository(ITourRepository iTourRepository) {
        this.ITourRepository = iTourRepository;
    }
    @Transactional
    public List<Tour> getAllTour(){
        return ITourRepository.findAll();
    }
}

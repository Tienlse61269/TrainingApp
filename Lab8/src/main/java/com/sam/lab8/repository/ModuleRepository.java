/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.lab8.repository;

import com.sam.lab8.entity.Module;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tungn
 */
@Repository
public interface ModuleRepository extends MongoRepository<Module, String> {

}

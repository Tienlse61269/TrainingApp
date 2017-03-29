/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.lab8.entity;

import java.io.Serializable;

/**
 *
 * @author Afk..HCM
 */
public class ClassModel implements Serializable {

    private String name;
    private Integer release;
    private Integer total;
    private Integer running;

    public ClassModel(String name, Integer release, Integer total, Integer running) {
        this.name = name;
        this.release = release;
        this.total = total;
        this.running = running;
    }

    public ClassModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRelease() {
        return release;
    }

    public void setRelease(Integer release) {
        this.release = release;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

}

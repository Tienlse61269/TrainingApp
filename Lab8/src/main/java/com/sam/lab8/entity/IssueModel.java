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
public class IssueModel implements Serializable {

    private int id;
    private String name;

    public IssueModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pontp.lab13.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author asus
 */
@Entity
@Table(name="payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name= "id", unique = true, nullable = false)
    int id;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "tour_id",referencedColumnName ="id", nullable = false)
    Tour tour;
    @Temporal(TemporalType.DATE)
    @Column(name= "created_date", nullable = false)
    Date created_date;
    @Column(name= "name", nullable = false)
    String name;
    @Column(name= "address", nullable = false)
    String address;
    @Column(name= "phone_number", nullable = false)
    String phone_number;
    @Column(name= "quantity",nullable = false)
    int quantity;
    @Column(name= "comment")
    String comment;

    public Payment() {
    }

    public Payment(int id, Tour tour, Date created_date, String name, String address, String phone_number, int quantity, String comment) {
        this.id = id;
        this.tour = tour;
        this.created_date = created_date;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.quantity = quantity;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", tour=" + tour + ", created_date=" + created_date + ", name=" + name + ", address=" + address + ", phone_number=" + phone_number + ", quantity=" + quantity + ", comment=" + comment + '}';
    }

  
    
    
    
}

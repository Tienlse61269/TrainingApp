
package com.pontp.lab13.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tour")
public class Tour {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name= "id", unique = true, nullable = false)
    private int id;
    @Column(name= "title", unique = true, nullable = false)
    private String title;
    @Column(name= "inCountry", nullable = false)
    private boolean inCountry;
    @Column(name= "link")
    private String link;
    @Column(name= "source")
    private String source;
    @Column(name= "image")
    private String image;
    @Column(name= "price")
    private double price;
    @Column(name= "transport")
    private String transport;
    @Column(name= "schedule")
    private String schedule;
    @Column(name= "depart")
    private String depart;
    @Column(name= "hotel")
    private int hotel;
    @Column(name= "duration")
    private String duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isInCountry() {
        return inCountry;
    }

    public void setInCountry(boolean inCountry) {
        this.inCountry = inCountry;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }



   

}

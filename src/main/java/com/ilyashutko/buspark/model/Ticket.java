package com.ilyashutko.buspark.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class Ticket {

    private int id;
    private int price;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date departmentTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date arrivalTime;
    private double distance;
    private int count;
    private User driver;
    private City departmentCity;
    private City arrivalCity;
    private Bus bus;

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    private String isInternational;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDepartmentTime() {
        return departmentTime;
    }

    public void setDepartmentTime(Date departmentTime) {
        this.departmentTime = departmentTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @OneToOne
    @JoinColumn(name="user_id")
    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    @OneToOne
    @JoinColumn(name="city_dep_id")
    public City getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(City departmentCity) {
        this.departmentCity = departmentCity;
    }

    @OneToOne
    @JoinColumn(name="city_arr_id")
    public City getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(City arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bus_id")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}

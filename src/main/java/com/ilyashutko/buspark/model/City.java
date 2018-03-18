package com.ilyashutko.buspark.model;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    private int id;
    private String name;
    private double distance;
}

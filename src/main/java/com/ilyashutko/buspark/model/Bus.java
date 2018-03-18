package com.ilyashutko.buspark.model;

import javax.persistence.*;

@Entity
@Table(name = "bus")
public class Bus {
    private int id;
    private String model;
    private int capacity;
    private User driver;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }
}

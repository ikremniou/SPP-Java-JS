package com.ilyashutko.buspark.modelViews;

public class TicketView {

    private int id;
    private int price;
    private String departmentTime;
    private String arrivalTime;
    private double distance;
    private int count;
    private String driver;
    private String departmentCity;
    private String arrivalCity;
    private String bus;
    private String isInternational;

    public String getisInternational() {
        return isInternational;
    }

    public void setisInternational(String international) {
        this.isInternational = international;
    }

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

    public String getDepartmentTime() {
        return departmentTime;
    }

    public void setDepartmentTime(String departmentTime) {
        this.departmentTime = departmentTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(String departmentCity) {
        this.departmentCity = departmentCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }
}

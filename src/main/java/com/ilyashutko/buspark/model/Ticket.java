package com.ilyashutko.buspark.model;

import java.util.Date;

public class Ticket {
    private int _id;
    private int _price;
    private Date _departmentTime;
    private Date _arrivalTime;
    private double _distance;
    private int _count;
    private String _govNumber;
    private int _driverId;
    private int _departmentCityId;
    private int _arrivalCityId;
    private int _busId;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_price() {
        return _price;
    }

    public void set_price(int _price) {
        this._price = _price;
    }

    public Date get_departmentTime() {
        return _departmentTime;
    }

    public void set_departmentTime(Date _departmentTime) {
        this._departmentTime = _departmentTime;
    }

    public Date get_arrivalTime() {
        return _arrivalTime;
    }

    public void set_arrivalTime(Date _arrivalTime) {
        this._arrivalTime = _arrivalTime;
    }

    public double get_distance() {
        return _distance;
    }

    public void set_distance(double _distance) {
        this._distance = _distance;
    }

    public int get_count() {
        return _count;
    }

    public void set_count(int _count) {
        this._count = _count;
    }

    public String get_govNumber() {
        return _govNumber;
    }

    public void set_govNumber(String _govNumber) {
        this._govNumber = _govNumber;
    }

    public int get_driverId() {
        return _driverId;
    }

    public void set_driverId(int _driverId) {
        this._driverId = _driverId;
    }

    public int get_departmentCityId() {
        return _departmentCityId;
    }

    public void set_departmentCityId(int _departmentCityId) {
        this._departmentCityId = _departmentCityId;
    }

    public int get_arrivalCityId() {
        return _arrivalCityId;
    }

    public void set_arrivalCityId(int _arrivalCityId) {
        this._arrivalCityId = _arrivalCityId;
    }

    public int get_busId() {
        return _busId;
    }

    public void set_busId(int _busId) {
        this._busId = _busId;
    }
}

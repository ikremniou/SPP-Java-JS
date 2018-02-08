package com.ilyashutko.buspark.model;

public class Buyer {
    private int _id;
    private String _name;
    private String _surname;
    private Integer _ticketId;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public Integer get_ticketId() {
        return _ticketId;
    }

    public void set_ticketId(Integer _ticketId) {
        this._ticketId = _ticketId;
    }
}

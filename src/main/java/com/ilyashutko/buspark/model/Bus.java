package com.ilyashutko.buspark.model;

public class Bus {
    private int _id;
    private String _model;
    private int _capacity;
    private  Integer _driverId;


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public int get_capacity() {
        return _capacity;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }

    public Integer get_driverId() {
        return _driverId;
    }

    public void set_driverId(Integer _driverId) {
        this._driverId = _driverId;
    }


}

package com.ilyashutko.buspark.bl;

import com.ilyashutko.buspark.bl.exception.ServiceOperationFailException;
import com.ilyashutko.buspark.dal.IRepository;
import com.ilyashutko.buspark.model.*;

import java.sql.SQLException;
import java.util.List;

public class BusParkService {

    private IRepository _repository;

    public  BusParkService(IRepository repository)
    {
        _repository = repository;
    }

    public List<City> GetAllCites() throws ServiceOperationFailException {
        try {
            return _repository.getAllCites();
        } catch (SQLException ex){
            throw new ServiceOperationFailException("Fail to get all cites", ex);
        }
    }

    public List<Bus> GetAllBuses() throws ServiceOperationFailException {
        try {
            return _repository.getAllBuses();
        } catch (SQLException ex){
            throw new ServiceOperationFailException("Fail to get all buses", ex);
        }
    }

    public List<Buyer> GetAllBuyers() throws ServiceOperationFailException {
        try {
            return _repository.getAllBuyers();
        } catch (SQLException ex){
            throw new ServiceOperationFailException("Fail to get all buyers", ex);
        }
    }

    public List<Ticket> GetAllTickets() throws ServiceOperationFailException {
        try {
            return _repository.getAllTickets();
        } catch (SQLException ex){
            throw new ServiceOperationFailException("Fail to get all tickets", ex);
        }
    }

    public List<Worker> GetAllWorkers() throws ServiceOperationFailException {
        try {
            return _repository.getAllWorkers();
        } catch (SQLException ex){
            throw new ServiceOperationFailException("Fail to get all worker", ex);
        }
    }
}

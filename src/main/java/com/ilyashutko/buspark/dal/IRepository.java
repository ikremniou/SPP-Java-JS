package com.ilyashutko.buspark.dal;

import com.ilyashutko.buspark.model.*;

import java.sql.SQLException;
import java.util.List;

public interface IRepository {
    List<City> getAllCites() throws SQLException;
    List<Bus> getAllBuses() throws SQLException;
    List<Ticket> getAllTickets() throws SQLException;
    List<User> getAllAccounts() throws SQLException;
}

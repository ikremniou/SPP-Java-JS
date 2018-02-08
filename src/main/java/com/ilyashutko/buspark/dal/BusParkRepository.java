package com.ilyashutko.buspark.dal;

import com.ilyashutko.buspark.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BusParkRepository implements IRepository {
    @Override
    public List<City> getAllCites() throws SQLException {
        List<City> cites = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(SqlHelper.Connection,
                    SqlHelper.UserName, SqlHelper.Password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SqlHelper.SelectAllFromCites);
            while (resultSet.next()) {
                City city = new City();
                city.set_id(resultSet.getInt("id"));
                city.set_name(resultSet.getString("name"));
                city.set_distance(resultSet.getDouble("distance"));
                cites.add(city);
            }
            return cites;
        }
        finally {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        }
    }

    @Override
    public List<Bus> getAllBuses() throws SQLException {
        List<Bus> buses = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(SqlHelper.Connection,
                    SqlHelper.UserName, SqlHelper.Password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SqlHelper.SelectAllFromBuses);
            while (resultSet.next()) {
                Bus bus = new Bus();
                bus.set_id(resultSet.getInt("id"));
                bus.set_model(resultSet.getString("model"));
                bus.set_capacity(resultSet.getInt("capacity"));
                bus.set_driverId(resultSet.getInt("driver_id"));
                buses.add(bus);
            }
            return buses;
        }
        finally {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        }
    }

    @Override
    public List<Buyer> getAllBuyers() throws SQLException {
        List<Buyer> buyers = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(SqlHelper.Connection,
                    SqlHelper.UserName, SqlHelper.Password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SqlHelper.SelectAllFromBuyers);
            while (resultSet.next()) {
                Buyer buyer = new Buyer();
                buyer.set_id(resultSet.getInt("id"));
                buyer.set_name(resultSet.getString("name"));
                buyer.set_surname(resultSet.getString("surname"));
                buyer.set_ticketId(resultSet.getInt("ticket_id"));
                buyers.add(buyer);
            }
            return buyers;
        }
        finally {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        }
    }

    @Override
    public List<Ticket> getAllTickets() throws SQLException {
        List<Ticket> tickets = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(SqlHelper.Connection,
                    SqlHelper.UserName, SqlHelper.Password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SqlHelper.SelectAllFromTickets);
            while (resultSet.next()) {
                Ticket ticket = new Ticket();
                ticket.set_id(resultSet.getInt("id"));
                ticket.set_price(resultSet.getInt("price"));
                ticket.set_departmentTime(resultSet.getDate("dep_time"));
                ticket.set_arrivalTime(resultSet.getDate("arr_time"));
                ticket.set_distance(resultSet.getDouble("distance"));
                ticket.set_count(resultSet.getInt("count"));
                ticket.set_govNumber(resultSet.getString("gov_number"));
                ticket.set_driverId(resultSet.getInt("driver_id"));
                ticket.set_departmentCityId(resultSet.getInt("dep_city_id"));
                ticket.set_arrivalCityId(resultSet.getInt("arr_city_id"));
                ticket.set_busId(resultSet.getInt("bus_id"));
                tickets.add(ticket);
            }
            return tickets;
        }
        finally {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        }
}

    @Override
    public List<Worker> getAllWorkers() throws SQLException {
        List<Worker> workers = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(SqlHelper.Connection,
                    SqlHelper.UserName, SqlHelper.Password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SqlHelper.SelectAllFromWorker);
            while (resultSet.next()) {
                Worker worker = new Worker();
                worker.set_id(resultSet.getInt("id"));
                worker.set_name(resultSet.getString("name"));
                worker.set_surname(resultSet.getString("surname"));
                worker.setRole(resultSet.getString("role"));
                workers.add(worker);
            }
            return workers;
        }
        finally {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        }
    }
}

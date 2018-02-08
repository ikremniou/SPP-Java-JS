package com.ilyashutko.buspark.dal;

public class SqlHelper {
    public static final String UserName = "root";
    public static final String Password = "12345";
    public static final String Connection ="jdbc:mysql://localhost:3306/buspark?useSSL=true";
    public static final String CitesTableName = "city";
    public static final String TicketsTableName = "tickets";
    public static final String BuyerTableName = "buyer";
    public static final String WorkerTableName = "worker";
    public static final String BusTableName = "bus";

    public static String SelectAllFromCites = "SELECT * FROM "+ CitesTableName;
    public static String SelectAllFromBuses = "SELECT * FROM "+ BusTableName;
    public static String SelectAllFromBuyers = "SELECT * FROM "+ BuyerTableName;
    public static String SelectAllFromTickets = "SELECT * FROM "+ TicketsTableName;
    public static String SelectAllFromWorker = "SELECT * FROM "+ WorkerTableName;
}

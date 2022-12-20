package com.example.search_engine;

import java.sql.*;

public class DatabaseConnection {

    String MySQLURL = "jdbc:mysql://localhost:3306/Search_Engine_Accio?useSSL=false";
    String DatabaseUserName = "root";
    String DatabasePassword = "Suku17@042000";

    Connection con = null;
    DatabaseConnection() throws SQLException { //to store the connection
        con = DriverManager.getConnection(MySQLURL, DatabaseUserName, DatabasePassword);
        System.out.println("Connection to the Database is successful.");
    }

    public ResultSet executeQuery(String query) throws SQLException {// for reading the input or query

        ResultSet ans = null;
        Statement statement = con.createStatement();
        ans = statement.executeQuery(query);

        return ans;//it's a boolean type
    }

    public int executeUpdate(String query) throws SQLException { // this must be an updated query,or to write query

        int ans = 0;
        Statement statement = con.createStatement();
        ans = statement.executeUpdate(query);

        return ans;
    }
}

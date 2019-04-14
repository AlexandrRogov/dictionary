package com.rogov.week08.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static final String URL = "db.url";
    private static final String USER = "db.username";
    private static final String PASS = "db.password";

    private ConnectionManager() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                PropertiesUtil.get(URL),
                PropertiesUtil.get(USER),
                PropertiesUtil.get(PASS));
    }
}

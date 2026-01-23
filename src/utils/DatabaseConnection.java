package utils;

import exception.DatabaseOperationException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/library_db";

    private static final String USER = "postgres";
    private static final String PASSWORD = "erasyl2008m";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new DatabaseOperationException("PostgreSQL connection failed", e);
        }
    }
}

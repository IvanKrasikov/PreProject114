package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final static String URL = "jdbc:mysql://localhost:3306/pre_project";
    private final static String USER = "root";
    private final static String PASS = "root";
    private static Connection conn = null;

    public Util() throws SQLException {
            conn = DriverManager.getConnection(URL, USER, PASS);
    }

    public Util(String url, String user, String pass) throws SQLException {
            conn = DriverManager.getConnection(url, user, pass);
    }

    public Connection getConn() {
        return conn;
    }
}

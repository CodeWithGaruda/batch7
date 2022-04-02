package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Prg1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://localhost:3307/preetam", "root", "root");
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/preetam", "root",
        // "");
        System.out.println("connection success");
    }
}
package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Prg1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://localhost:3307/preetam", "root",
                "root");
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/preetam", "root",
        // "");
        // Connection connection = getConnection();
        System.out.println("connection success");

    }

    // this is extra connection with data pooling
    public static Connection getConnection() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("file.properties"));
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(properties.getProperty("url"));
        dataSource.setUser(properties.getProperty("user"));
        dataSource.setPassword(properties.getProperty("pass"));
        return dataSource.getConnection();
    }
}
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class SwathiConnection {
    static Connection getXamppCon() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3307/swathirocks", "root", "root");
    }
}

public class Prg3 {
    public static void main(String[] args) throws Exception {
        Connection connection = SwathiConnection.getXamppCon();
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO employee (id,name,designation,salary) VALUES (3,'sanath','guitarist',5000)");
        int res = statement
                .executeUpdate();
        System.out.println(res);
    }
}

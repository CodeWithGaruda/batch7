package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Prg5 {
    public static void main(String[] args) throws Exception {
        Connection connection = SwathiConnection.getXamppCon();
        PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM employee WHERE name='xample'");
        int res = statement
                .executeUpdate();
        System.out.println(res);
    }
}

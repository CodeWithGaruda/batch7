package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Prg4 {
    public static void main(String[] args) throws Exception {
        Connection connection = SwathiConnection.getXamppCon();
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE employee SET name = 'swathi jakson' WHERE id = 1");
        int res = statement
                .executeUpdate();
        System.out.println(res);
    }
}

package util;

import java.sql.Connection;
import java.sql.SQLException;

public class DML_DAO {
    public static void executeDML (String sql) {
        Connection con;

        try {
            con = DB_Connector.connect();
            con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DML_DAO {
    public static ResultSet executeDML (String sql) {
        ResultSet rs = null;
        Connection con;
        try {
            DB_Connector dbc = null;
            con = dbc.connect();
            rs = con.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
}

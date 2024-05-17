package com.example.myjavaweb.model;

import java.sql.SQLException;
import java.sql.*;

public class LoginBean implements LoginDAO {
    private static final Connection connection;

    static {
        try {
            connection = ConnectionDB.getMySQLConnection();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private Statement statement = null;

    @Override
    public boolean checkLogin(String username, String password) throws SQLException {
        //Dung prepare statement
        String sql = "select * from pizza.user_info where Name=? and Password=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
}

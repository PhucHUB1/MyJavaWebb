package com.example.myjavaweb;

import java.sql.SQLException;
import java.sql.*;

public class LoginBean implements LoginDAO{
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
    public boolean checkLoginStatement(String username, String password) throws SQLException {
        //Query
        String query = "select username from users where username like '"+username+"' and password like '"+password+"'";

        //Tạo statement mỗi lần thực thi
        statement = connection.createStatement();

        //Tạo đối tượng ResultSet để nhận kết quả từ database trả về
        ResultSet resultSet = statement.executeQuery(query);


        if (resultSet.next()) {
            System.out.println("Username is: " + resultSet.getString("username"));
        }

        return false;
    }
}

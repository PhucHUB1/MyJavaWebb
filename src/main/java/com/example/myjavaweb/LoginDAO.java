package com.example.myjavaweb;

import java.sql.SQLException;

public interface LoginDAO {
    public boolean checkLoginStatement(String username, String password) throws SQLException;

//    public String checkLoginPreparedStatement(Users user) throws SQLException;
}
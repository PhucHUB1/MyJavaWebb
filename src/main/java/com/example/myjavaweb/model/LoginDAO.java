package com.example.myjavaweb.model;

import java.sql.SQLException;

public interface LoginDAO {
    public boolean checkLogin(String username, String password) throws SQLException;

//    public String checkLoginPreparedStatement(Users user) throws SQLException;
}
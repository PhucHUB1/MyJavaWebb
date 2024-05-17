package com.example.myjavaweb.controller;

import com.example.myjavaweb.HelloServlet;
import com.example.myjavaweb.model.LoginBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HelloServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           req.setCharacterEncoding("UTF-8");
           PrintWriter out = resp.getWriter();

           //nhan du  lieu tu form :  step 1
           String username = req.getParameter("username");
           String password = req.getParameter("password");
///
           //step 2
        LoginBean loginBean = new LoginBean();
        try {
            boolean isValidUser = loginBean.checkLogin(username,password);
            if(isValidUser){
                RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
                rd.forward(req,resp);
            }else {
                RequestDispatcher rd = req.getRequestDispatcher("failure.jsp");
                rd.forward(req,resp);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

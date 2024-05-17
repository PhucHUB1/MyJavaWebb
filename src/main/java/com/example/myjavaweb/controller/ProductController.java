package com.example.myjavaweb.controller;

import com.example.myjavaweb.model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ProductController", value = "/ProductController")
public class ProductController extends HttpServlet {

    ArrayList<Product> products = new ArrayList<Product>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        switch (action) {
            case "add":
                addProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                listProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
        }
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void addProduct(HttpServletRequest req, HttpServletResponse resp) {

    }

    private void listProduct(HttpServletRequest req, HttpServletResponse resp) {

    }
}

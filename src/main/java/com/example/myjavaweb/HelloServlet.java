package com.example.myjavaweb;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    //Khoi tao Servlet
    //Tao ra 1 cap doi tuong duy nhat la: Req va Res . Cac request sau do toi Servlet
    // khong can phai khoi tao lai cap Req va Res vi chung chi can tao 1 lan dau tien.
    // Dieu nay la do Servlet Container quan li vong doi Servlet.
    // Vai tro cua Servlet Container:
    /*
     * 1.LifeCycle Management: Quan li vong doi Servlet,khoi tao,load class,call method .... giai phong tai nguyen
     * 2.JSP support : Quan li JSP
     * 3.Communication support: Quan li giao tiep giua Servlet va Webserver
     **/

    //Chi dc goi 1 lan truoc khi servlet xu ly cac request(truoc khi service() dc goi)
    // method nay co the Override
    public void init() {
        message = "Hello World!";
    }

    //service():dc goi boi container khi cac client make req,co the goi nhieu lan de xu ly cac req
    //service() dua vao HTTP req de goi cac doXXX() tuong ung. Method nay duoc xu ly trong tung
    // Thread(luong) rieng biet.
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    //doPost():dc goi boi service() tuy thuoc vao HTTP request
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    //doGet():dc goi boi service()
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    //getAllProduct(): dc goi boi service()

    //Chi dc goi chinh xac 1 lan boi container
    public void destroy() {
    }
}
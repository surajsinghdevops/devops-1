package com.techbookstore.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

 protected void doPost(HttpServletRequest req,
 HttpServletResponse res) throws IOException {

 String email=req.getParameter("email");
 String pass=req.getParameter("password");

 if(email.equals("admin@gmail.com") && pass.equals("123")) {

 res.sendRedirect("admin.jsp");

 } else {

 res.sendRedirect("books.jsp");

 }

 }
}

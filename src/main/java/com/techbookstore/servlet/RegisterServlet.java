package com.techbookstore.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

import com.techbookstore.dao.UserDAO;
import com.techbookstore.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

 protected void doPost(HttpServletRequest req,
 HttpServletResponse res) throws IOException {

 User user=new User();

 user.setUsername(req.getParameter("username"));
 user.setEmail(req.getParameter("email"));
 user.setPassword(req.getParameter("password"));

 UserDAO.register(user);

 res.sendRedirect("login.jsp");
 }
}

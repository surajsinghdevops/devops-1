package com.techbookstore.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

import com.techbookstore.dao.BookDAO;
import com.techbookstore.model.Book;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {

 protected void doPost(HttpServletRequest req,
 HttpServletResponse res) throws IOException {

 Book book=new Book();

 book.setName(req.getParameter("name"));
 book.setAuthor(req.getParameter("author"));
 book.setPrice(Double.parseDouble(req.getParameter("price")));
 book.setQuantity(Integer.parseInt(req.getParameter("quantity")));

 BookDAO.addBook(book);

 res.sendRedirect("admin.jsp");
 }
}

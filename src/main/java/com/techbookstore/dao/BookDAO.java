package com.techbookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.techbookstore.model.Book;
import com.techbookstore.util.DBConnection;

public class BookDAO {

    public static boolean addBook(Book book) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "insert into books(name,author,price,quantity) values(?,?,?,?)");

            ps.setString(1,book.getName());
            ps.setString(2,book.getAuthor());
            ps.setDouble(3,book.getPrice());
            ps.setInt(4,book.getQuantity());

            ps.executeUpdate();

            return true;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}

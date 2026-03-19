package com.techbookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.techbookstore.model.User;
import com.techbookstore.util.DBConnection;

public class UserDAO {

    public static boolean register(User user) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "insert into users(username,email,password) values(?,?,?)");

            ps.setString(1,user.getUsername());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());

            ps.executeUpdate();

            return true;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}

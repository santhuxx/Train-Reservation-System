package user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class usermethod {
    private static boolean isdone;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    // Method to validate user credentials
    public static boolean validate(String username, String password) {
        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from user where username='" + username + "' and password='" + password + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                isdone = true;
            } else {
                isdone = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isdone;
    }

    // Method to retrieve user details
    public static List<user> getuser(String username) {
        ArrayList<user> users = new ArrayList<>();

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from user where username='" + username + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String phone = rs.getString(4);
                String username1 = rs.getString(5);
                String password = rs.getString(6);

                user u1 = new user(id, name, email, phone, username1, password);
                users.add(u1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    // Method to insert a new user
    public static boolean insertuser(String name, String email, String phone, String username, String password) {
        boolean isdone = false;

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "insert into user values (0, '" + name + "', '" + email + "', '" + phone + "', '" + username + "', '" + password + "')";
            int rs = stmt.executeUpdate(sql);

            if (rs > 0) {
                isdone = true;
            } else {
                isdone = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isdone;
    }

    // Method to update user details
    public static boolean updateuser(String id, String name, String email, String phone, String username, String password) {
        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "update user set name='" + name + "', email='" + email + "', phone='" + phone + "', username='" + username + "', password='" + password + "' where id='" + id + "'";
            int rs = stmt.executeUpdate(sql);

            if (rs > 0) {
                isdone = true;
            } else {
                isdone = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isdone;
    }

    // Method to retrieve user details by ID
    public static List<user> getuserDetails(String Id) {
        int convertedID = Integer.parseInt(Id);

        ArrayList<user> users = new ArrayList<>();

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from customer where id='" + convertedID + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String phone = rs.getString(4);
                String username = rs.getString(5);
                String password = rs.getString(6);

                user c = new user(id, name, email, phone, username, password);
                users.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    // Method to delete a user by ID
    public static boolean deleteuser(String id) {
        int convId = Integer.parseInt(id);

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "delete from user where id='" + convId + "'";
            int r = stmt.executeUpdate(sql);

            if (r > 0) {
                isdone = true;
            } else {
                isdone = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isdone;
    }
}

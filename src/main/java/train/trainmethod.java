package train;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class trainmethod {
    private static boolean isdone;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    // Method to validate a train by its name
    public static boolean validate(String tname) {
        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from trainnew where tname='" + tname + "'";
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

    // Method to retrieve train details by name
    public static List<train> gettrain(String tname) {
        ArrayList<train> trains = new ArrayList<>();

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from trainnew where tname='" + tname + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int tid = rs.getInt(1);
                String tname1 = rs.getString(2);
                String ttype = rs.getString(3);
                String tcount = rs.getString(4);
                String tdetails = rs.getString(5);

                train t = new train(tid, tname1, ttype, tcount, tdetails);
                trains.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return trains;
    }

    // Method to insert a new train
    public static boolean inserttrain(String tname, String ttype, String tcount, String tdetails) {
        boolean isdone = false;

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "insert into trainnew values (0,'" + tname + "','" + ttype + "','" + tcount + "','" + tdetails + "')";
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

    // Method to update train details
    public static boolean updatetrain(String tid, String tname, String ttype, String tcount, String tdetails) {
        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "update trainnew set tname='" + tname + "', ttype='" + ttype + "', tcount='" + tcount + "', tdetails='" + tdetails + "' where tid='" + tid + "'";
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

    // Method to retrieve train details by ID
    public static List<train> gettrainDetails(String tid) {
        int convertedID = Integer.parseInt(tid);

        ArrayList<train> trains = new ArrayList<>();

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from trainnew where tid='" + convertedID + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int tid1 = rs.getInt(1);
                String tname = rs.getString(2);
                String ttype = rs.getString(3);
                String tcount = rs.getString(4);
                String tdetails = rs.getString(5);

                train t = new train(tid1, tname, ttype, tcount, tdetails);
                trains.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return trains;
    }

    // Method to delete a train by ID
    public static boolean deletetrain(String tid) {
        int convId = Integer.parseInt(tid);

        try {
            con = dbconnect.getConnection();
            stmt = con.createStatement();
            String sql = "delete from trainnew where tid='" + convId + "'";
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

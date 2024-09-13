package com.station;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class StationDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static boolean validate(String stname) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from station where stname='"+stname+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Station> getStation(String stName) {
		
		ArrayList<Station> cus = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from station";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String stno = rs.getString(2);
				String stname = rs.getString(3);
				String district = rs.getString(4);
				String phone = rs.getString(5);

	
				
				Station c = new Station(id,stno,stname,district,phone);
				cus.add(c);
			}
			
		} catch (Exception e) {
			
		}
		
		return cus;	
	}
			 

	
    public static boolean insertstation(String stno,String stname, String district, String phone) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into station values (0,'"+stno+"','"+stname+"','"+district+"','"+phone+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
	  public static boolean updatestation(String id, String stno, String stname, String district, String phone) {
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update station set stno='"+stno+"',stname='"+stname+"',district='"+district+"',phone='"+phone+"'" 
	    				+ "where id='"+id+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	  public static List<Station> getStationDetails(String Id) {
			
			int convertedID = Integer.parseInt(Id);
			
			ArrayList<Station> cus = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from station where id='"+convertedID+"'";
				rs = stmt.executeQuery(sql);
				
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String stno = rs.getString(2);
	    			String stname = rs.getString(3);
	    			String district = rs.getString(4);
	    			String phone = rs.getString(5);
	

	    			
	    			Station c = new Station(id,stno,stname,district,phone);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return cus;	
	    }
	    
	    public static boolean deleteStation(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from station where id='"+convId+"'";
	    		int r = stmt.executeUpdate(sql);
	    		
	    		if (r > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
}

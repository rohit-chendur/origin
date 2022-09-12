package com.sonata.prodDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	Connection con;
	
	public Connection getcon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_details","root","root@123");		
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		  catch (SQLException s) {s.printStackTrace();}
		
		return con;
	}
	
	public void closeCon() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException sq) {sq.printStackTrace();}
	}
}

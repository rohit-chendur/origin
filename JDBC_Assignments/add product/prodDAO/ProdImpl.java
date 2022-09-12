package com.sonata.prodDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.prodBean.ProdBean;
import com.sonata.prodImpl.ProdIntf;

public class ProdImpl implements ProdIntf{
	DBConnection db = new DBConnection();

	public int insert(Object obj) {
		int row = 0;
		ProdBean pb = new ProdBean();
		try {
		//INSERTION
//			PreparedStatement p1 = db.getcon().prepareStatement("insert into product values (?,?,?)");
//			p1.setInt(1, pb.getProdID());
//			p1.setString(2, pb.getProdName());
//			p1.setDouble(3, pb.getProdPrice());
//			row = p1.executeUpdate();

		//UPDATE
			PreparedStatement p2 = db.getcon().prepareStatement("UPDATE product SET productPrice = ? WHERE productName = ?");
			p2.setString(2, pb.getProdName());
			p2.setDouble(1, pb.getProdPrice());
			row = p2.executeUpdate();
		
		//DELETE
//			PreparedStatement p3 = db.getcon().prepareStatement("delete from product where productID = ?");
//			p3.setInt(1, pb.getProdID());
//			p3.setString(2, pb.getProdName());
//			p3.setDouble(3, pb.getProdPrice());
//			row = p3.executeUpdate();
			
		} catch (SQLException sq) {sq.printStackTrace();}
		
		return row; 
	}

}

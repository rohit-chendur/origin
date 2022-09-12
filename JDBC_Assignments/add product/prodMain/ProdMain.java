package com.sonata.prodMain;

import com.sonata.prodBean.ProdBean;
import com.sonata.prodDAO.ProdImpl;

public class ProdMain {
	
	public static void main(String[] args) {
		ProdBean pb = new ProdBean();
		pb.setProdPrice(20);
		pb.setProdName("Chips");
		
		ProdImpl pi = new ProdImpl();
		int a = pi.insert(pb);
		if (a==1) {System.out.println("Product details inserted");}
		else {System.out.println("Product details not inserted");}
		
		
	}

}

package com.sonata.prodDB;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.sonata.prodBean.ProdBean;
import com.sonata.prodDAO.ProdImpl;

public class prodTest {

	ProdBean pb = new ProdBean();
	ProdImpl pi = new ProdImpl();
	
	@Test
	public void positiveTest() {
		pb.setProdID(234);
		pb.setProdName("Chewing Gum");
		pb.setProdPrice(5.63);
		int row = pi.insert(pb);
		assertEquals(1, row);
	}
	
	@Test
	public void negativeTest() {
		pb.setProdID(234);
		pb.setProdName("Chewing Gum");
		pb.setProdPrice(5.63);
		int row = pi.insert(pb);
		assertEquals(0, row);
	}
}

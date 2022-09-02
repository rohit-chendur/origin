package com.sonata.day3assignment;

public class UsingPeople {

	public static void main(String[] args) {
		
		//Technical Employee Instance
		TechnicalEmployee t1 = new TechnicalEmployee(22839, "Jayavardhan M", "JAVA", 25000, 5);
		Address tAdd = new Address(16, "BTM Layout", "Bengaluru", 560076);
		t1.address = tAdd;
		
		//Staff
		Staff s1 = new Staff(12345, "Staff Name", "Staff Title", 12000, 2);
		Address sAdd = new Address(16, "HSR Layout", "Bengaluru", 560076);
		s1.address = sAdd;
		
		//Display all details
		System.out.println(t1);
		System.out.println("\n\n" + s1);
	}
}
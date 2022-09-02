package com.sonata.day3assignment;

public abstract class Employee {
	int empId,numofLeaves;
	String empName;
	double basicPay;
	Address address = new Address();
	public abstract double calculateSalary();
}
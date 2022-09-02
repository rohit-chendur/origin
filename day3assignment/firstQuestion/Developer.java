package com.sonata.day3assignment.firstQuestion;

public class Developer extends Employee {
	double yearlySal;
	Developer() {}
	Developer(int id, String name, double sal) {
		super.empId = id;
		super.empName = name;
		super.empSal = sal;
	}
	public void display() {
		System.out.print(" - Developer Details - \nEmployee ID - " + empId + "\nEmployee Name - " + empName + "\nMonthly Salary - " + empSal + "\nYearly Salary - ");
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println(yearlySal + "\n");
	}
}
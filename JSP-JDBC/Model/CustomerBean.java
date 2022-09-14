package com.sonata.Registration.Model;

public class CustomerBean {
	private String custName;
	private String custPhno;
	private String custEmail;
	private String custPass;
	
	public CustomerBean() {
		super();
	}
	
	public CustomerBean(String custName, String custPhno, String custEmail, String custPass) {
		super();
		this.custName = custName;
		this.custPhno = custPhno;
		this.custEmail = custEmail;
		this.custPass = custPass;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhno() {
		return custPhno;
	}
	public void setCustPhno(String custPhnno) {
		this.custPhno = custPhnno;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
}
    
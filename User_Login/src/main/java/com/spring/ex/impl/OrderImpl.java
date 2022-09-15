package com.spring.ex.impl;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ex.intf.LoginIntf;

//@SpringBootApplication
public class OrderImpl {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext contx = new ClassPathXmlApplicationContext("bean.xml");
		LoginIntf li = (LoginIntf) contx.getBean("login");
		System.out.println(li.getValUser("rohit", "rohit123"));
	}
}

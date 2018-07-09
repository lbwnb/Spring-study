package com.lbwnb.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lbwnb.spring.services.CustomerService;

public class App {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext(new String[] {"SpringFiltering.xml"});
	
	CustomerService cust = (CustomerService) context.getBean("customerService");
	System.out.println(cust);
}
}

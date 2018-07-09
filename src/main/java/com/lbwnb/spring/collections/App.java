package com.lbwnb.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
private static ApplicationContext context;

public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("SpringCollections.xml");
	/*
	 * case 1 : List第1种情况
	 */
	Customer lists = (Customer) context.getBean("customerBean");
	System.out.println(lists.getLists().toString());
	
	/*
	 * case 2 : Set第2种情况
	 */
	Customer sets = (Customer) context.getBean("customerBean");
	System.out.println(sets.getSets().toString());
	
	/*
	 * case 3 : Map第3种情况
	 */
	Customer maps = (Customer) context.getBean("customerBean");
	System.out.println(maps.getMaps().toString());
	
	/*
	 * case 4 : 第4种情况
	 */
	Customer pros = (Customer) context.getBean("customerBean");
	System.out.println(pros.getPros().toString());
}
}

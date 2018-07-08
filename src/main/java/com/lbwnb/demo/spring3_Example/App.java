package com.lbwnb.demo.spring3_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lbwnb.demo.helloworld.HelloWorld;
import com.lbwnb.demo.loosely_coupled.OutputHelper;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
	
    public static void main( String[] args )
    {
        //context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        //HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        //obj.printHello();
    	context = new ClassPathXmlApplicationContext(new String[]{"Spring-Output.xml"});
    	
    	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
    }
}

package com.wipro.SpringFirst;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//Vehicle obj= (Vehicle)context.getBean("vehicle");
		/*	Vehicle obj= (Vehicle)context.getBean("bike");
		obj.drive();*/
		/*Tyre t=(Tyre) context.getBean("tyreBrand");
		System.out.println(t);*/


		Car obj=(Car)context.getBean(Car.class);
		obj.drive();

		//System.out.println( "Hello World!" );
	}
}

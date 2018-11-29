package com.wipro.spring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App
{
	//hello
	public static void main( String[] args )
	{

		ApplicationContext context= new AnnotationConfigApplicationContext(Configuration.class);
		Samsung phone=(Samsung) context.getBean(Samsung.class);
		phone.config();

	}
}

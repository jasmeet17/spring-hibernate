package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check if two beans are same
		boolean result = theCoach == alphaCoach;
		
		System.out.println("pointing same object : " + result);

		System.out.println("Memory theCoach : " + theCoach);
		System.out.println("Memory alphaCoach : " + alphaCoach);
		
		context.close();

	}

}

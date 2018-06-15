package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		TennisCoach theTennisCoach1 = context.getBean("thatSillyCoach", TennisCoach.class);
	
		//get the bean from spring container
		TennisCoach theTennisCoach2 = context.getBean("thatSillyCoach", TennisCoach.class);
	
		boolean result = theTennisCoach1==theTennisCoach2;
		
		System.out.println("Are results equal? " + result);
		System.out.println("Memory address theTennisCoach1: " + theTennisCoach1);
		System.out.println("Memory address theTennisCoach2: " + theTennisCoach2);
		
		//close the context
		context.close();

	}

}

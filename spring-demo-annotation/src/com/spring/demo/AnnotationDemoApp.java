package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//call a method from the bean
		System.out.println("Workout: " + theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

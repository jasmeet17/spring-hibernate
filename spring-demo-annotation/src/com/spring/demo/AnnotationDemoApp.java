package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		TennisCoach theCoach = context.getBean("thatSillyCoach", TennisCoach.class);
		Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
		
		//call a method from the bean
		System.out.println("Tennis Workout: " + theCoach.getDailyWorkout());
		System.out.println("Baseball Workout: " + theBaseballCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println("TableTennis Fortune: " + theCoach.getDailyFortuen());
		
		//call method to get daily fortune on Baseball coach
		System.out.println("Baseball Fortune: " + theBaseballCoach.getDailyFortuen());
		
		//demo inject properties file using Java annotations
		System.out.println("Tennis team name :" + theCoach.getTeam());
				
		
		//close the context
		context.close();
	}

}

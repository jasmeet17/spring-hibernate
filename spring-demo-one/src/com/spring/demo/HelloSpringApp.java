package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		CricketCoach criCoach = context.getBean("myCricketCoach", CricketCoach.class);
		Coach baseBallCoach = context.getBean("myBaseballCoach", Coach.class);
		Coach footBallCoach = context.getBean("myFootballCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(criCoach.getDailyWorkout());
		System.out.println(criCoach.getDailyFortune());
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());
		
		System.out.println("Cricket Email: " + criCoach.getEmail());
		System.out.println("Cricket Team: " + criCoach.getTeam());
		System.out.println("Cricket Team Owner: " + criCoach.getOwner());
		
		System.out.println("Football Fortune: " + footBallCoach.getDailyFortune());
		System.out.println("Football Workout: " + footBallCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

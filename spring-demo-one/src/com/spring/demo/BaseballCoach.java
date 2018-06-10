package com.spring.demo;

public class BaseballCoach implements Coach {
	
	//define private field for dependency 
	private FortuneService fortuneService;
	
	//define a construction in the class for injections
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 40 minutes Batting.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
}

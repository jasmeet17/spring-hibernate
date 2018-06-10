package com.spring.demo;

public class TrackCoach implements Coach {
	
	//define private field for dependency 
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + this.fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach Inside method: doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach Inside method: doMyCleanUpStuff");
	}

}

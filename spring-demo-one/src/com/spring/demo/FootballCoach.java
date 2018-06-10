package com.spring.demo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play 60 Minutes everyday";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}

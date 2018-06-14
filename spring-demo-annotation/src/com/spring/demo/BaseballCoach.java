package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	//Setter Dependency Injection
	@Autowired
	@Qualifier("happyFortuneServices")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Jump 2 mins";
	}

	@Override
	public String getDailyFortuen() {
		
		return this.fortuneService.getFortune();
	}

}

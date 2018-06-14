package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneServices;
	
	// Constructor Injection
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}
	*/
	
	// Method Injection
	@Autowired
	public void doSomeFortuneStuff(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getDailyWorkout() {
		return fortuneServices.getFortune();
	}

	@Override
	public String getDailyFortuen() {
		return this.fortuneServices.getFortune();
	}

}

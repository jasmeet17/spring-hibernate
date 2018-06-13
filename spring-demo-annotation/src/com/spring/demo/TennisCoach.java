package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneServices;
	
	@Autowired
	public TennisCoach(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getDailyWorkout() {
		return fortuneServices.getFortune();
	}

}

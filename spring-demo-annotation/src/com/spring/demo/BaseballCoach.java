package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Jump 2 mins";
	}

	@Override
	public String getDailyFortuen() {
		
		return "You are Lucky";
	}

}

package com.spring.demo;

public class SwimCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim 20 mins";
	}

	@Override
	public String getDailyFortuen() {
		return "Future is bright";
	}

}

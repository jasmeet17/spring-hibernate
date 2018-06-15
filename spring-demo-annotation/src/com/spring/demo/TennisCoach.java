package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneServices;
	
	@Value("${foo.team}")
	private String team;
	
	// Constructor Injection
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}
	*/
	
	// Method Injection
	/*
	@Autowired
	public void doSomeFortuneStuff(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}
	*/

	public String getTeam() {
		return team;
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

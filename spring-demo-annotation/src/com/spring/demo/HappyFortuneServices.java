package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneService {

	@Override
	public String getFortune() {
		
		return "You are Lucky!";
	}

}

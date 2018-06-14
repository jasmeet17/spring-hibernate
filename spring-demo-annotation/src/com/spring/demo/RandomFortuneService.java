package com.spring.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String fortunes[] = {"Lucky", "Very Lucky"};
	
	@Override
	public String getFortune() {
		int rnd = new Random().nextInt(fortunes.length);
	    return this.fortunes[rnd];
	}

}

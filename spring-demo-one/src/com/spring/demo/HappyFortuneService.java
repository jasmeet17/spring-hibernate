package com.spring.demo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "You Lucky.";
	}

}

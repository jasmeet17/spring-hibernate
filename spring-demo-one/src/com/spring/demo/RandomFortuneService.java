package com.spring.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String arr[] = {"Happy Fortune", "Very Happy Fortune", "Travelling Fortune"};
	@Override
	public String getFortune() {
		int rnd = new Random().nextInt(arr.length);
	    return this.arr[rnd];
	}

}

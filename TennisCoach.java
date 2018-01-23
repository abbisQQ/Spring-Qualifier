package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

	@Autowired
	//This will choose HappyFortuneService instead of the other classes that implements FortuneService.
	@Qualifier("happyFortuneService")//bean id to inject happyfortuneService
	private FortuneService FortuneService;
	
	public TennisCoach() {
		System.out.println("Inside tennis coach instructor");
	}
	


	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Back hand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}

}

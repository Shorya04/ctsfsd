package com.myCompany.setter_injection2_Beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TennisCoach implements Coach{
	private int age;
	private String email;
	
	private FortuneService fortuneService;
	
	

	public TennisCoach() {
		System.out.println("Inside default constructor!!");
	}

	
	public TennisCoach( FortuneService fortuneService) {
		System.out.println("Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do stretching daily.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
}

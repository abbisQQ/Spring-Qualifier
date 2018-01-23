package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load the config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("config.xml");
				
				
				//Load the beans from spring container using the bean id
				Coach theCoach = context.getBean(Coach.class);
				
				System.out.println(theCoach.getDailyWorkOut());
		
				
				
				System.out.println(theCoach.getDailyFortune());
	}

}

package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting up of context for dependency injection with the help of java bean
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("corolla",Car.class);
		System.out.println(myCar.specs());
		
		context.close();
	}

}

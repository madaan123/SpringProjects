package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component
public class Swift implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Swift from Maruti";
	}

}

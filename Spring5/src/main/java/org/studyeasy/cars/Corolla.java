package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component
public class Corolla implements Car {
	@Autowired
	Engine engine;

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		String specs ="Sedan forom toyota with engine type as " + engine.getType();
		return specs;
	}

}

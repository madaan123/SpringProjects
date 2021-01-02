package org.studyeasy.specs;

import org.studyeasy.interfaces.Engine;

public class EngineType implements Engine {

	String type;
	
	public EngineType() {
	}

	public EngineType(String type) {
		super();
		this.type = type;
	}

	@Override
	public String Type() {
		// TODO Auto-generated method stub
		return type;
	}

}

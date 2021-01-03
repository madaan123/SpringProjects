package org.studyeasy.model;

import java.util.Arrays;

public class User {
	private String name,gender,country,introduction,countryVisited[];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String[] getCountryVisited() {
		return countryVisited;
	}

	public void setCountryVisited(String[] countryVisited) {
		this.countryVisited = countryVisited;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", country=" + country + ", introduction=" + introduction
				+ ", countryVisited=" + Arrays.toString(countryVisited) + "]";
	}
	
}

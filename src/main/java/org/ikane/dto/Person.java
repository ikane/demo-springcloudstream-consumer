package org.ikane.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

	private String firtName;
	private String lastName;
	private int age;
	
	
	public Person() {
		// Auto-generated constructor stub
	}
	
	public Person(String firtName, String lastName, int age) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}

package com.java.features.eight.streams;

public class EmployeeShort {
	private String name;
	private int age;

	public EmployeeShort() {
	}

	public EmployeeShort(final String name, final int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeShort [name=" + this.name + ", age=" + this.age + "]";
	}

}

package com.java.features.eight.streams;

public class Employee {
	private String name;
	private int workingYears;
	private int age;
	private int weight;
	private EType type;

	public Employee() {
	}

	public Employee(final String name, final int workingYears, final int age, final int weight, final EType type) {
		super();
		this.name = name;
		this.workingYears = workingYears;
		this.age = age;
		this.weight = weight;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public Employee setName(final String name) {
		this.name = name;
		return this;
	}

	public int getWorkingYears() {
		return this.workingYears;
	}

	public Employee setWorkingYears(final int workingYears) {
		this.workingYears = workingYears;
		return this;
	}

	public int getAge() {
		return this.age;
	}

	public Employee setAge(final int age) {
		this.age = age;
		return this;
	}

	public int getWeight() {
		return this.weight;
	}

	public Employee setWeight(final int weight) {
		this.weight = weight;
		return this;
	}

	public EType getType() {
		return this.type;
	}

	public Employee setType(final EType type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.age;
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + ((this.type == null) ? 0 : this.type.hashCode());
		result = (prime * result) + this.weight;
		result = (prime * result) + this.workingYears;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (this.age != other.age) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.type != other.type) {
			return false;
		}
		if (this.weight != other.weight) {
			return false;
		}
		if (this.workingYears != other.workingYears) {
			return false;
		}
		return true;
	}

}

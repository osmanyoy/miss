package com.training.patterns.structural.decorator;

import com.training.patterns.structural.adapter.Employee;

public class EmployeeDecoSayin extends Employee {
	private Employee employee;

	public EmployeeDecoSayin(final Employee employee) {
		this.employee = employee;
	}

	@Override
	public void setName(final String name) {
		this.employee.setName(name);
	}

	@Override
	public String getSurname() {
		return this.employee.getSurname();
	}

	@Override
	public void setSurname(final String surname) {
		this.employee.setSurname(surname);
	}

	@Override
	public String getEmail() {
		return this.employee.getEmail();
	}

	@Override
	public void setEmail(final String email) {
		this.employee.setEmail(email);
	}

	@Override
	public String getName() {
		return "Sayin " + this.employee.getName();
	}

}

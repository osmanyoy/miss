package com.training.patterns.structural.adapter;

public class PrinterSystem {

	public void print(final Employee employee) {
		System.out.println("Name : " + employee.getName() + " Surname : " + employee.getSurname() + " email : "
		        + employee.getEmail());
	}
}

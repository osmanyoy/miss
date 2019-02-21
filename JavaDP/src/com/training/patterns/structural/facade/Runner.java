package com.training.patterns.structural.facade;

import com.training.patterns.structural.adapter.Employee;

public class Runner {
	public static void main(final String[] args) {
		Employee employee = new Employee();
		employee.setName("osman");
		employee.setSurname("yaycýoðlu");
		employee.setEmail("os@os.com");

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.provisionEmployeeToSystem(employee);

	}
}

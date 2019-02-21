package com.training.patterns.structural.facade;

import com.training.patterns.structural.adapter.Employee;

public class EmployeeManager {

	private EmployeeFacade employeeFacade = new EmployeeFacade();

	public void provisionEmployeeToSystem(final Employee employee) {
		this.employeeFacade.provisionEmployeeToSystem(employee);
	}

}

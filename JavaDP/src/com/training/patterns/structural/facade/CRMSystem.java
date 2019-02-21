package com.training.patterns.structural.facade;

import com.training.patterns.structural.adapter.Employee;

public class CRMSystem {
	public void createEmployee(final Employee employee) {
		System.out.println("Employee Created in CRM");
	}

	public void commitEmployee(final Employee employee) {
		System.out.println("Employee Commited in CRM");
	}

}

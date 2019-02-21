package com.training.patterns.structural.decorator;

import com.training.patterns.structural.adapter.Employee;

public class EmployeeDecoFactory {

	public static Employee getPrintType(final Employee employee, final int printType) {
		switch (printType) {
		case 1:
			return employee;
		case 2:
			return new EmployeeDecoSayin(employee);
		case 3:
			return new EmployeeDecoHazretleri(new EmployeeDecoSayin(employee));
		default:
			return null;
		}
	}

}

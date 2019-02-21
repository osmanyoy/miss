package com.training.patterns.structural.decorator;

import com.training.patterns.structural.adapter.Employee;
import com.training.patterns.structural.adapter.PrinterSystem;

public class Runner {
	public static void main(final String[] args) {
		Employee employee = new Employee();
		employee.setName("osman");
		employee.setSurname("yaycýoðlu");
		employee.setEmail("os@os.com");

		Employee printType = EmployeeDecoFactory.getPrintType(employee,
		                                                      3);
		PrinterSystem printerSystem = new PrinterSystem();
		printerSystem.print(printType);
	}
}

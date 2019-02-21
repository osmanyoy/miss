package com.training.patterns.structural.proxy;

import com.training.patterns.structural.adapter.Employee;
import com.training.patterns.structural.adapter.PrinterSystem;

public class ProxyRunner {
	public static void main(final String[] args) {
		PrinterSystem printerSystem = PrinterSystemFactory.createPrinterSystem();
		Employee employee = new Employee();
		employee.setName("osman");
		employee.setSurname("yaycýoðlu");
		employee.setEmail("os@os.com");

		printerSystem.print(employee);
	}
}

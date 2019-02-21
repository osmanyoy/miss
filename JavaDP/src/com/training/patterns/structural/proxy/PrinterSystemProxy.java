package com.training.patterns.structural.proxy;

import com.training.patterns.structural.adapter.Employee;
import com.training.patterns.structural.adapter.PrinterSystem;

public class PrinterSystemProxy extends PrinterSystem {
	private PrinterSystem printerSystem;

	public PrinterSystemProxy(final PrinterSystem printerSystem) {
		super();
		this.printerSystem = printerSystem;
	}

	@Override
	public void print(final Employee employee) {
		System.out.println("Print iþlemi yapýlacak");
		this.printerSystem.print(employee);
		System.out.println("Print iþlemi yapýldý");
	}
}

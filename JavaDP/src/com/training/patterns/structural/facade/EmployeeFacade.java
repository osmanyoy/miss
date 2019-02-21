package com.training.patterns.structural.facade;

import com.training.patterns.structural.adapter.Employee;
import com.training.patterns.structural.adapter.PrinterSystem;

public class EmployeeFacade {

	private CRMSystem crmSystem = new CRMSystem();
	private BillingSystem billSystem = new BillingSystem();
	private PrinterSystem printerSystem = new PrinterSystem();

	public void provisionEmployeeToSystem(final Employee employee) {
		this.crmSystem.createEmployee(employee);
		this.billSystem.provisionEmployee(employee);
		this.printerSystem.print(employee);
		this.crmSystem.commitEmployee(employee);
	}

}

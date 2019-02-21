package com.training.patterns.structural.facade;

import com.training.patterns.structural.adapter.Employee;

public class BillingSystem {

	public void provisionEmployee(final Employee employee) {
		System.out.println("EMployee provisioned to Billing System");
	}
}

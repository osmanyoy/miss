package com.training.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
	private Map<Integer, Customer> myCustomers = new HashMap<>();

	public Customer createCustomer(final int customerType) {
		Customer customer = this.myCustomers.get(customerType);
		if (customer == null) {
			// Web service call yap ve datalarý al
			customer = new Customer();
			customer.setCustomerType(customerType);
			customer.setCustomerTypeDesc("dkjfdfd");
			customer.setCustomerMultiplier(1.2D);
			this.myCustomers.put(customerType,
			                     customer);
			return customer;
		} else {
			return customer.clone();
		}
	}
}

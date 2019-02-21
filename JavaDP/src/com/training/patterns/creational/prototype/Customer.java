package com.training.patterns.creational.prototype;

public class Customer {

	private String name;
	private int age;

	private int customerType;
	private String customerTypeDesc;
	private double customerMultiplier;

	@Override
	public Customer clone() {
		Customer customer = new Customer();
		customer.customerType = this.customerType;
		customer.customerMultiplier = this.customerMultiplier;
		customer.customerTypeDesc = this.customerTypeDesc;
		return customer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public int getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(final int customerType) {
		this.customerType = customerType;
	}

	public String getCustomerTypeDesc() {
		return this.customerTypeDesc;
	}

	public void setCustomerTypeDesc(final String customerTypeDesc) {
		this.customerTypeDesc = customerTypeDesc;
	}

	public double getCustomerMultiplier() {
		return this.customerMultiplier;
	}

	public void setCustomerMultiplier(final double customerMultiplier) {
		this.customerMultiplier = customerMultiplier;
	}

}

package com.training.patterns.structural.adapter;

public class PersonEmployeeAdapter extends Employee {
	private Person person;

	public PersonEmployeeAdapter(final Person person) {
		super();
		this.person = person;
	}

	@Override
	public String getName() {
		return this.person.getIsim();
	}

	@Override
	public String getSurname() {
		return this.person.getSoyisim();
	}

	@Override
	public String getEmail() {
		return this.person.getEmail();
	}

}

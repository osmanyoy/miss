package com.training.patterns.structural.adapter;

public class Runner {
	public static void main(final String[] args) {

		PrinterSystem printerSystem = new PrinterSystem();
		Employee employee = new Employee();
		employee.setName("osman");
		employee.setSurname("yaycýoðlu");
		employee.setEmail("os@os.com");

		printerSystem.print(employee);

		Person person = new Person();
		person.setIsim("os");
		person.setSoyisim("soy");
		person.setEmail("tt@tt.com");

		PersonEmployeeAdapter adapter = new PersonEmployeeAdapter(person);

		printerSystem.print(adapter);

	}
}

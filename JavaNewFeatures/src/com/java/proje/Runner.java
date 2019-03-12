package com.java.proje;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(final String[] args) {

		// Kriterler kriterler = new Kriterler("001", "00882", "SND", "IRAQ", 100);
		Kriterler kriterler2 = new Kriterler("001", "00882", "*", "*", 200);
		Kriterler kriterler3 = new Kriterler("001", "*", "*", "IRAQ", 300);
		Kriterler kriterler4 = new Kriterler("*", "*", "*", "IRAQ", 400);
		List<Kriterler> kriterlers = new ArrayList<>();
		kriterlers.add(kriterler4);
		kriterlers.add(kriterler3);
		kriterlers.add(kriterler2);
		// kriterlers.add(kriterler);

		AbstractFilter abstractFilter = FilterFactory.createFilterChain(kriterlers);

		Kriterler kriterlerRequest = new Kriterler("001", "00883", "SND", "IRAQ", 0);
		Kriterler execute = abstractFilter.execute(kriterlerRequest);
		if (execute != null) {
			System.out.println(execute.getAmount());
		}
	}
}

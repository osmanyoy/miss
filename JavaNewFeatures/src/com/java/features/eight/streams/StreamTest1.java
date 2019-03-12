package com.java.features.eight.streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {
	public static void main(final String[] args) {
		List<String> asList = Arrays.asList("osman12",
		                                    "osman1",
		                                    "osman3",
		                                    "osman3",
		                                    "os2",
		                                    "osman2",
		                                    "os1",
		                                    "os3");

//		List<String> finalList = new ArrayList<>();
//		for (String string : asList) {
//			if (string.length() > 5) {
//				finalList.add(string);
//			}
//		}
//		Collections.sort(finalList);
//
//		for (String string : finalList) {
//			System.out.println("sonuc " + string);
//		}

		System.out.println(asList.stream()
		                         .filter(s -> {
			                         System.out.println("filter" + s);
			                         return s.length() > 5;
		                         })
		                         .sorted()
		                         .distinct()
		                         // .skip(1)
		                         .limit(2)
		                         .peek(System.out::println)
		                         .allMatch(k -> k.length() == 6)
		// .anyMatch(k -> k.equals("osman1"))
		);
		// .count();
//		      .forEach(e -> System.out.println("sonuc : " + e));
		Employee emp = new Employee("osman", 10, 49, 95, EType.DIRECTOR);
		Employee emp1 = new Employee().setName("osman2")
		                              .setAge(49)
		                              .setWeight(95)
		                              .setWorkingYears(10)
		                              .setType(EType.DIRECTOR);

	}
}

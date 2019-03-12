package com.java.features.eight.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(final String[] args) {
		Stream<Employee> employeeStream = Stream.of(new Employee("osman", 10, 49, 95, EType.DIRECTOR),
		                                            new Employee("mehmet", 9, 45, 80, EType.MANAGER),
		                                            new Employee("ali", 5, 35, 105, EType.MANAGER),
		                                            new Employee("ayse", 3, 27, 60, EType.IT_STAFF),
		                                            new Employee("veli", 3, 25, 70, EType.IT_STAFF),
		                                            new Employee("ayse", 3, 27, 60, EType.IT_STAFF),
		                                            new Employee("veli", 3, 25, 70, EType.IT_STAFF),
		                                            new Employee("pelin", 6, 30, 60, EType.IT_STAFF),
		                                            new Employee("murat", 7, 31, 77, EType.HR_STAFF),
		                                            new Employee("fatma", 8, 32, 45, EType.HR_STAFF),
		                                            new Employee("hasan", 15, 44, 80, EType.IT_STAFF),
		                                            new Employee("huseyin", 11, 39, 95, EType.HR_STAFF),
		                                            new Employee("osman", 4, 35, 79, EType.IT_STAFF));

//		Map<EType, List<Employee>> collect = employeeStream.collect(Collectors.groupingBy(Employee::getType));
//		System.out.println(collect);
//
		System.out.println("-----------------------------------------");

//		List<String> collect2 = employeeStream.map(Employee::getName)
//		                                      .collect(Collectors.toList());
//		System.out.println(collect2);

//		List<EmployeeShort> collect = employeeStream.map((final Employee e) -> new EmployeeShort(e.getName(),
//		        e.getAge()))
//		                                            .sorted((final EmployeeShort a, final EmployeeShort b) -> b.getAge()
//		                                                    - a.getAge())
//		                                            .collect(Collectors.toList());
//		List<EmployeeShort> collect = employeeStream.map((final Employee e) -> new EmployeeShort(e.getName(),
//		        e.getAge()))
//		                                            .sorted(Comparator.comparing(EmployeeShort::getAge)
//		                                                              .reversed())
//		                                            .collect(Collectors.toList());
//
//		System.out.println(collect);

//		IntSummaryStatistics collect = employeeStream.map((final Employee e) -> new EmployeeShort(e.getName(),
//		        e.getAge()))
//		                                             .sorted(Comparator.comparing(EmployeeShort::getAge)
//		                                                               .reversed())
//		                                             .distinct()
//		                                             .collect(Collectors.summarizingInt(EmployeeShort::getAge));
//		System.out.println(collect);

		List<EmployeeShort> collect = employeeStream.distinct()
		                                            .map((final Employee e) -> new EmployeeShort(e.getName(),
		                                                    e.getAge()))
		                                            .sorted(Comparator.comparing(EmployeeShort::getAge)
		                                                              .reversed())

		                                            .collect(Collectors.toList());
		System.out.println(collect);

		Optional<String> optional = Optional.of("osman");
//		if (optional.isPresent()) {
//			String string = optional.get();
//		}
//		optional.ifPresent(System.out::println);
		// String orElse = optional.orElse("empty");

		optional.filter(s -> s.length() > 10)
		        .ifPresent(System.out::println);

		// System.out.println(orElse);
	}
}

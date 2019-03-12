package com.java.features.eight.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
	public static void main(final String[] args) {
		try (Stream<String> lines = Files.lines(Paths.get("d:/temp/test.txt"))) {
//			String collect = lines.distinct()
//			                      .sorted()
//			                      .collect(Collectors.joining(","));
//			Integer collect = lines.distinct()
//			                       .sorted()
//			                       .peek(System.out::println)
//			                       .collect(Collectors.reducing(0,
//			                                                    s -> s.length(),
//			                                                    (a, b) -> {
//				                                                    System.out.println("a : " + a + " b : " + b);
//				                                                    return a + b;
//			                                                    }));

//			int collect = lines.distinct()
//			                   .sorted()
//			                   .peek(System.out::println)
//			                   .mapToInt(s -> s.length())
//			                   .peek(System.out::println)
//			                   .sum();
			// System.out.println(lines.collect(Collectors.toList()));
//			List<String> collect = lines.distinct()
//			                            .sorted()
//			                            .map(s -> s.split(""))
//			                            .flatMap(Arrays::stream)
//			                            .distinct()
//			                            .collect(Collectors.toList());
//
//			System.out.println(collect);
			Map<String, EmployeeShort> collect = lines.distinct()
			                                          .map(s -> {
				                                          String[] strs = s.split(",");
				                                          return new EmployeeShort(strs[0],
				                                                  Integer.parseInt(strs[1]));
			                                          })
			                                          .collect(Collectors.toMap(EmployeeShort::getName,
			                                                                    e -> e));
			System.out.println(collect);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

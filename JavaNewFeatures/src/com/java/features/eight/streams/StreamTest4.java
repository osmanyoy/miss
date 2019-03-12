package com.java.features.eight.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
	public static void main(final String[] args) {
		try (Stream<String> lines = Files.lines(Paths.get("d:/temp/test.txt"))) {
			List<String> collect = lines.distinct()
			                            .sorted()
			                            .collect(Collectors.toList());
			System.out.println(collect);
		} catch (Exception e) {
		}
	}
}

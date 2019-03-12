package com.java.features.eight.lambda.predefined;

import java.util.function.Function;

public class FunctionTest {
	public static void main(final String[] args) {
		Function<String, Integer> func = s -> s.length();

		System.out.println(func.apply("osman"));
	}
}

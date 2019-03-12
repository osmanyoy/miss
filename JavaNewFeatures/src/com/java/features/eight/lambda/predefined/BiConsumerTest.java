package com.java.features.eight.lambda.predefined;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(final String[] args) {
		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);

		biConsumer.accept("biconsumer",
		                  " test");

	}
}

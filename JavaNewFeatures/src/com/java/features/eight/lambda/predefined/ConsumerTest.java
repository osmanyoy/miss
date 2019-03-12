package com.java.features.eight.lambda.predefined;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(final String[] args) {
		Consumer<String> consumer = ((Consumer<String>) s -> System.out.println(s)).andThen(s -> System.out.println("other"
		        + s));
		consumer.accept("osman");
	}
}

package com.java.features.eight.lambda.shortcuts;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ShortcutTest {
	public static void main(final String[] args) {
		Predicate<String> ps = s -> s.isEmpty();
		Predicate<String> ps1 = String::isEmpty;

		Consumer<String> cs = s -> System.out.println(s);
		Consumer<String> cs1 = System.out::println;

		IMyString myString = (s, i) -> s.substring(i);
		IMyString myString2 = String::substring;

	}
}

package com.java.features.eight.lambda.predefined;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(final String[] args) {
		Predicate<String> strPredicate = ((Predicate<String>) s -> s.startsWith("osman")).or(s -> s.length() > 10);
		System.out.println(strPredicate.test("osman yaycýoðlu"));

		Predicate<String> and = ((Predicate<String>) s -> s.startsWith("osman")).and(s -> s.length() > 10);

		strPredicate.and(s -> s.length() > 10);

	}
}

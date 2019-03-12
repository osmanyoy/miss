package com.java.features.eight.lambda.predefined;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateTest {
	public static void main(final String[] args) {
		IntPredicate intPredicate = i -> i > 0;
		System.out.println(intPredicate.test(100));

		LongPredicate longPredicate = l -> l > 0;
		System.out.println(longPredicate.test(100));

		DoublePredicate doublePredicate = d -> d > 0D;
		System.out.println(doublePredicate.test(100D));

	}
}

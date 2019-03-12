package com.java.features.eight.lambda;

@FunctionalInterface
public interface ILambda {
	String test(String string);

	default String help(final String str) {
		return "test " + str;
	}
}

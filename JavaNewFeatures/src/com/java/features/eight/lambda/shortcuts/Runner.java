package com.java.features.eight.lambda.shortcuts;

public class Runner {
	public static void main(final String[] args) {
		ITest test = s -> new MyObject(s);
		ITest test2 = MyObject::new;

	}
}

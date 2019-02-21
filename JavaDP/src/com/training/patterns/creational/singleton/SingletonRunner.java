package com.training.patterns.creational.singleton;

public class SingletonRunner {
	public static void main(final String[] args) {
		System.out.println(MyEagerSingleton.getInstance()
		                                   .hello());
		System.out.println(ESingleton.Instance2.hello());
	}
}

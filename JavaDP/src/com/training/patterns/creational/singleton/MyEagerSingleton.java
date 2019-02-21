package com.training.patterns.creational.singleton;

public class MyEagerSingleton {

	private static MyEagerSingleton instance = new MyEagerSingleton();

	private MyEagerSingleton() {
	}

	public static MyEagerSingleton getInstance() {
		return MyEagerSingleton.instance;
	}

	public String hello() {
		return "hello world";
	}

}

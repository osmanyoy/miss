package com.training.patterns.creational.singleton;

public class MyLazySingleton {

	private volatile static MyLazySingleton instance;

	private MyLazySingleton() {
	}

	public static MyLazySingleton getInstance() {
		if (MyLazySingleton.instance == null) {
			synchronized (MyLazySingleton.class) {
				if (MyLazySingleton.instance == null) {
					MyLazySingleton.instance = new MyLazySingleton();
				}
			}
		}
		return MyLazySingleton.instance;
	}

	public static MyLazySingleton getInstance2() {
		synchronized (MyLazySingleton.class) {
			if (MyLazySingleton.instance == null) {
				MyLazySingleton.instance = new MyLazySingleton();
			}
			return MyLazySingleton.instance;
		}
	}

}

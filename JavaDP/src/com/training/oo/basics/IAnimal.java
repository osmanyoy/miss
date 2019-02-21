package com.training.oo.basics;

public interface IAnimal {
	String move(int m);

	default String say() {
		return "Hello";
	}

}

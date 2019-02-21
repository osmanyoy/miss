package com.training.patterns.creational.factory;

import com.training.oo.basics.IAnimal;

public class AnimalRunner {
	public static void main(final String[] args) {
		IAnimal b = AnimalFactory.createAnimal(args[0]);
		System.out.println(b.say());
		System.out.println(b.move(10));
	}
}

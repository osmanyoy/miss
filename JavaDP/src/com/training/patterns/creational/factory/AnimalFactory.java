package com.training.patterns.creational.factory;

import com.training.oo.basics.IAnimal;

public class AnimalFactory {
	public static IAnimal createAnimal(final String animalName) {
		IAnimal b = null;
		switch (animalName) {
		case "bird":
			b = new Bird();
			break;
		case "cat":
			b = new Cat();
			break;
		case "dog":
			b = new Dog();
			break;
		default:
			break;
		}
		return b;
	}
}

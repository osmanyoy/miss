package com.training.patterns.creational.factory;

import com.training.oo.basics.AbstractAnimal;

public class Bird extends AbstractAnimal {

	public Bird() {
		super(30);
	}

	@Override
	public String move(final int m) {
		return "Uçuyorum";
	}

	@Override
	public String getName() {
		return "Kuþ";
	}

}

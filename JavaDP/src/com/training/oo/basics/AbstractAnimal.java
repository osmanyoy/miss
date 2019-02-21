package com.training.oo.basics;

public abstract class AbstractAnimal implements IAnimal {

	protected int height;

	public AbstractAnimal(final int height) {
		this.height = height;

	}

	@Override
	public String say() {
		return this.getName() + " I am talking";
	}

	abstract public String getName();

}

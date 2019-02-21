package com.training.patterns.creational.absfactory;

public class KalinHaliYikama implements IYikama {

	@Override
	public void kopurt() {
		System.out.println("Kalin Hali kopurtme yapýldý");
	}

	@Override
	public void yika() {
		System.out.println("Kalin Hali yýkama yapýldý");

	}

}

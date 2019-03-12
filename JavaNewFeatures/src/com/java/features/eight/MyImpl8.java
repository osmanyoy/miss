package com.java.features.eight;

public class MyImpl8 extends MyMustExtend implements IMyInterface {

	@Override
	public String process(final String str) {
		return "Processing " + str;
	}

}

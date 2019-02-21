package com.training.patterns.behavioral.chainofrespo;

public class CheckLess0 extends AbstractChain {

	public CheckLess0(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value < 0) {
			return "value negatif";
		}
		return null;
	}

}

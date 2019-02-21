package com.training.patterns.behavioral.chainofrespo;

public class CheckEquals50 extends AbstractChain {

	public CheckEquals50(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value == 50) {
			return "value 50";
		}
		return null;
	}

}

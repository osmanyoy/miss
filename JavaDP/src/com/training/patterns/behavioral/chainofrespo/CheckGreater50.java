package com.training.patterns.behavioral.chainofrespo;

public class CheckGreater50 extends AbstractChain {

	public CheckGreater50(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value > 50) {
			return "value 50 den büyük";
		}
		return null;
	}

}

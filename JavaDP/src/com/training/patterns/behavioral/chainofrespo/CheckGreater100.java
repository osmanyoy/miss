package com.training.patterns.behavioral.chainofrespo;

public class CheckGreater100 extends AbstractChain {

	public CheckGreater100(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value > 100) {
			return "value 100 den büyük";
		}
		return null;
	}

}

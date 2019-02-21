package com.training.patterns.behavioral.chainofrespo;

public class CheckGreater0 extends AbstractChain {

	public CheckGreater0(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value > 0) {
			return "value 0 dan büyük";
		}
		return null;
	}

}

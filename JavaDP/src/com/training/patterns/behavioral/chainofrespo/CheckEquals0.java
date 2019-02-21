package com.training.patterns.behavioral.chainofrespo;

public class CheckEquals0 extends AbstractChain {

	public CheckEquals0(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value == 0) {
			return "value 0";
		}
		return null;
	}

}

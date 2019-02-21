package com.training.patterns.behavioral.chainofrespo;

public class CheckEquals100 extends AbstractChain {

	public CheckEquals100(final AbstractChain next) {
		super(next);
	}

	@Override
	public String runMe(final int value) {
		if (value == 100) {
			return "value 100";
		}
		return null;
	}

}

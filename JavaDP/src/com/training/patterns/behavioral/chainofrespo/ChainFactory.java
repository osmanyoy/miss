package com.training.patterns.behavioral.chainofrespo;

public class ChainFactory {
	public static AbstractChain createChain(final int type) {
		switch (type) {
		case 1:
			return new CheckGreater100(new CheckEquals100(
			        new CheckGreater50(new CheckEquals50(new CheckGreater0(new CheckEquals0(new CheckLess0(null)))))));

		case 2:
			return new CheckGreater100(new CheckEquals100(new CheckGreater0(new CheckEquals0(new CheckLess0(null)))));
		default:
			return new CheckGreater0(new CheckEquals0(new CheckLess0(null)));
		}

	}
}

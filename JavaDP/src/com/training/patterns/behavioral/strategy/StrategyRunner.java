package com.training.patterns.behavioral.strategy;

public class StrategyRunner {
	public static void main(final String[] args) {
		Asker asker = new Asker(new YariIsabet());
		asker.atesEt();
		asker.atesEt();
		asker.atesEt();
		asker.atesEt();
	}
}

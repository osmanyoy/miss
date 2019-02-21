package com.training.patterns.behavioral.strategy;

import java.util.Random;

public class YariIsabet implements IAskerStrategy {

	@Override
	public void atesEt() {
		Random random = new Random();
		int nextInt = random.nextInt(100);
		if (nextInt > 50) {
			System.out.println("Vurdum");
		} else {
			System.out.println("Vuramadım");
		}

	}

}

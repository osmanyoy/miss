package com.training.patterns.behavioral.chainofrespo;

public class Runner {
	public static void main(final String[] args) {
		int value = 49;
		int type = 1;
		if (type == 1) {
			if (value > 100) {
				System.out.println("value 100 den büyük");
			} else if (value == 100) {
				System.out.println("value 100");
			} else if (value > 50) {
				System.out.println("value 50 den büyük");
			} else if (value > 0) {
				System.out.println("value 0 dan büyük");
			} else if (value == 0) {
				System.out.println("value 0 ");
			} else if (value < 0) {
				System.out.println("value negatif ");
			}
		} else if (type == 2) {
			if (value > 100) {
				System.out.println("value 100 den büyük");
			} else if (value == 100) {
				System.out.println("value 100");
			} else if (value > 0) {
				System.out.println("value 0 dan büyük");
			} else if (value == 0) {
				System.out.println("value 0 ");
			} else if (value < 0) {
				System.out.println("value negatif ");
			}

		} else {
			if (value > 0) {
				System.out.println("value 0 dan büyük");
			} else if (value == 0) {
				System.out.println("value 0 ");
			} else if (value < 0) {
				System.out.println("value negatif ");
			}
		}

		AbstractChain abstractChain = ChainFactory.createChain(type);
		String run = abstractChain.run(value);
		System.out.println(run);
	}
}

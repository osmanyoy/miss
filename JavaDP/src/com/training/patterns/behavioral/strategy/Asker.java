package com.training.patterns.behavioral.strategy;

public class Asker {
	private IAskerStrategy st;

	public Asker(final IAskerStrategy st) {
		super();
		this.st = st;
	}

	public void atesEt() {
		System.out.println("Asker ates ediyor");
		this.st.atesEt();
		System.out.println("Asker ates etti");
	}

}

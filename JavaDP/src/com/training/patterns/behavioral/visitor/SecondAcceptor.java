package com.training.patterns.behavioral.visitor;

public class SecondAcceptor extends AbstractAcceptor {

	public void playVideo() {
		System.out.println("Playing Video");
	}

	@Override
	public void accept(final IVisitor visitor) {
		visitor.execute(this);

	}

}

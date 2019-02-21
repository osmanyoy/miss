package com.training.patterns.behavioral.visitor;

public class FirstAcceptor extends AbstractAcceptor {

	@Override
	public void accept(final IVisitor visitor) {
		visitor.execute(this);
	}

	public void playMusic() {
		System.out.println("Playing Music");
	}

}

package com.training.patterns.behavioral.visitor;

public class VisitorTwo implements IVisitor {

	@Override
	public void execute(final FirstAcceptor acceptor) {
		System.out.println("Visitor Two in action");
		acceptor.playMusic();
		System.out.println("Visitor Two finish action");

	}

	@Override
	public void execute(final SecondAcceptor acceptor) {
		System.out.println("Visitor Two in action");
		acceptor.playVideo();
		System.out.println("Visitor Two finish action");

	}

}

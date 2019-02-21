package com.training.patterns.behavioral.visitor;

public class VisitorOne implements IVisitor {

	@Override
	public void execute(final FirstAcceptor acceptor) {
		System.out.println("Visitor One in action");
		acceptor.playMusic();
		System.out.println("Visitor One finish action");

	}

	@Override
	public void execute(final SecondAcceptor acceptor) {
		System.out.println("Visitor One in action");
		acceptor.playVideo();
		System.out.println("Visitor One finish action");

	}

}

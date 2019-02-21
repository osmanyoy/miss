package com.training.patterns.behavioral.visitor;

public class VisitorRunner {
	public static void main(final String[] args) {
		FirstAcceptor acceptor = new FirstAcceptor();
		acceptor.accept(new VisitorTwo());

		SecondAcceptor acceptor2 = new SecondAcceptor();
		acceptor2.accept(new VisitorTwo());

	}
}

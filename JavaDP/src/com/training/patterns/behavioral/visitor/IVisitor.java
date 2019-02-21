package com.training.patterns.behavioral.visitor;

public interface IVisitor {
	void execute(FirstAcceptor acceptor);

	void execute(SecondAcceptor acceptor);

}

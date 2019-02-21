package com.training.patterns.behavioral.mediator;

public interface IListener {
	void listen(String originator, Message msg);

	String getName();
}

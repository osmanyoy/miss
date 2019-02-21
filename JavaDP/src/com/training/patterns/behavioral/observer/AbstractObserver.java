package com.training.patterns.behavioral.observer;

public abstract class AbstractObserver implements IObserver {

	@Override
	public void register(final EEventType eEventType, final IObserver observer) {
		throw new IllegalArgumentException("Not implemented");
	}

}

package com.training.patterns.behavioral.mediator;

public abstract class AbstractListener implements IListener {
	private final Mediator mediator;

	public AbstractListener(final Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return this.mediator;
	}

}

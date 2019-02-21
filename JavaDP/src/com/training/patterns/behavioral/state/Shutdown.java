package com.training.patterns.behavioral.state;

public class Shutdown implements ILifeCycle {
	private StateManager stateManager;

	public Shutdown(final StateManager stateManager) {
		super();
		this.stateManager = stateManager;
	}

	@Override
	public void run() {

	}

	@Override
	public void idle() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void shutdown() {

	}

}

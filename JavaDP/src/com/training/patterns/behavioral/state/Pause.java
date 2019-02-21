package com.training.patterns.behavioral.state;

public class Pause implements ILifeCycle {
	private StateManager stateManager;

	public Pause(final StateManager stateManager) {
		super();
		this.stateManager = stateManager;
	}

	@Override
	public void run() {
		System.out.println("Changing state PAUSE to RUN");
		this.stateManager.setCurrentState(new Running(this.stateManager));
	}

	@Override
	public void idle() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void shutdown() {
		System.out.println("Changing state RUN to SHUTDOWN");
		this.stateManager.setCurrentState(new Shutdown(this.stateManager));
	}

}

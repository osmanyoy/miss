package com.training.patterns.behavioral.state;

public class Idle implements ILifeCycle {
	private StateManager stateManager;

	public Idle(final StateManager stateManager) {
		super();
		this.stateManager = stateManager;
	}

	@Override
	public void run() {
		System.out.println("Changing state IDLE to RUN");
		this.stateManager.setCurrentState(new Running(this.stateManager));
	}

	@Override
	public void idle() {
	}

	@Override
	public void pause() {
		System.out.println("Changing state IDLE to PAUSE");
		this.stateManager.setCurrentState(new Pause(this.stateManager));
	}

	@Override
	public void shutdown() {
		System.out.println("Changing state IDLE to SHUTDOWN");
		this.stateManager.setCurrentState(new Shutdown(this.stateManager));
	}

}

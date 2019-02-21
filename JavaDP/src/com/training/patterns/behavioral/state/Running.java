package com.training.patterns.behavioral.state;

public class Running implements ILifeCycle {
	private StateManager stateManager;

	public Running(final StateManager stateManager) {
		super();
		this.stateManager = stateManager;
	}

	@Override
	public void run() {
	}

	@Override
	public void idle() {
		System.out.println("Changing state RUN to IDLE");
		this.stateManager.setCurrentState(new Idle(this.stateManager));
	}

	@Override
	public void pause() {
		System.out.println("Changing state RUN to PAUSE");
		this.stateManager.setCurrentState(new Pause(this.stateManager));
	}

	@Override
	public void shutdown() {
		System.out.println("Changing state RUN to SHUTDOWN");
		this.stateManager.setCurrentState(new Shutdown(this.stateManager));
	}

}

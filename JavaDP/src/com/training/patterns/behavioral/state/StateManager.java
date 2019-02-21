package com.training.patterns.behavioral.state;

public class StateManager implements ILifeCycle {
	private ILifeCycle currentState = new Idle(this);

	@Override
	public void run() {
		this.currentState.run();
	}

	@Override
	public void idle() {
		this.currentState.idle();
	}

	@Override
	public void pause() {
		this.currentState.pause();
	}

	@Override
	public void shutdown() {
		this.currentState.shutdown();
	}

	public ILifeCycle getCurrentState() {
		return this.currentState;
	}

	public void setCurrentState(final ILifeCycle currentState) {
		this.currentState = currentState;
	}

}

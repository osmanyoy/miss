package com.training.patterns.behavioral.state;

public class StateRunner {
	public static void main(final String[] args) {
		StateManager stateManager = new StateManager();

		stateManager.run();

		stateManager.pause();

		stateManager.run();

		stateManager.shutdown();
	}
}

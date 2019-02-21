package com.training.patterns.behavioral.state;

public interface ILifeCycle {
	void run();

	void idle();

	void pause();

	void shutdown();
}

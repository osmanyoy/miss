package com.training.patterns.behavioral.chainofrespo;

public abstract class AbstractChain {
	private AbstractChain next;

	public AbstractChain(final AbstractChain next) {
		super();
		this.next = next;
	}

	public String run(final int value) {
		String runMe = this.runMe(value);
		if (runMe != null) {
			return runMe;
		}
		if (this.next == null) {
			return null;
		}
		return this.next.run(value);
	}

	public abstract String runMe(final int value);
}

package com.training.patterns.behavioral.interpreter;

public class InterpretterContext {
	private final String commandStr;
	private final String[] commandParts;

	public InterpretterContext(final String commandStr) {
		super();
		this.commandStr = commandStr;
		this.commandParts = this.commandStr.split(" ");

	}

	public String getCommandStr() {
		return this.commandStr;
	}

	public String[] getCommandParts() {
		return this.commandParts;
	}

}

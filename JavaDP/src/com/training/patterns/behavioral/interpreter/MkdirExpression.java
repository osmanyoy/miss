package com.training.patterns.behavioral.interpreter;

public class MkdirExpression implements IExpression {

	@Override
	public void interpret(final InterpretterContext ic) {
		if (ic.getCommandParts().length != 2) {
			System.err.println("Please use mkdir [dir]");
		} else {
			System.out.println("Creating directory : " + ic.getCommandParts()[1]);
		}
	}

}

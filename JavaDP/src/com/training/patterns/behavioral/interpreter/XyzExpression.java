package com.training.patterns.behavioral.interpreter;

public class XyzExpression implements IExpression {

	@Override
	public void interpret(final InterpretterContext ic) {
		if (ic.getCommandParts().length != 2) {
			System.err.println("Please use xyz [dir]");
		} else {
			System.out.println("XYZ directory : " + ic.getCommandParts()[1]);
		}
	}

}

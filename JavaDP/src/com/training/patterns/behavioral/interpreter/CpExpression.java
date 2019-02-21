package com.training.patterns.behavioral.interpreter;

public class CpExpression implements IExpression {

	@Override
	public void interpret(final InterpretterContext ic) {
		if (ic.getCommandParts().length != 3) {
			System.err.println("Please use cp [from dir] [to dir]");
		} else {
			System.out.println("copying files from directory : " + ic.getCommandParts()[1] + " to directory : "
			        + ic.getCommandParts()[2]);
		}
	}

}

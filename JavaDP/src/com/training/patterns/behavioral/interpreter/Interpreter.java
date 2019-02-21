package com.training.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Interpreter implements IExpression {
	public Map<String, IExpression> expressions = new HashMap<>();

	public Interpreter() {
		this.expressions.put("mkdir",
		                     new MkdirExpression());
		this.expressions.put("cp",
		                     new CpExpression());
		this.expressions.put("xyz",
		                     new XyzExpression());
	}

	@Override
	public void interpret(final InterpretterContext ic) {
		IExpression iExpression = this.expressions.get(ic.getCommandParts()[0]);
		if (iExpression != null) {
			iExpression.interpret(ic);
		} else {
			System.err.println("Not command");
		}
	}

}

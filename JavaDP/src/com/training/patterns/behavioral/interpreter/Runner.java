package com.training.patterns.behavioral.interpreter;

import java.util.Scanner;

public class Runner {
	public static void main(final String[] args) {
		Interpreter interpreter = new Interpreter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("komut : ");
		String nextLine = scanner.nextLine();
		InterpretterContext interpretterContext = new InterpretterContext(nextLine);
		interpreter.interpret(interpretterContext);
	}
}

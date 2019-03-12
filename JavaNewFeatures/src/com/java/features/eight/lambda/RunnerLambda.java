package com.java.features.eight.lambda;

public class RunnerLambda {
	public static void main(final String[] args) {
		final String string = "test";
		IHelp help = () -> {
			System.out.println("lambda çaðrýldý");
			return string;
		};
		System.out.println(help.help());

		System.out.println(RunnerLambda.runLambda(a -> {
			String string1 = "lambda : " + a;
			return string1;
		},
		                                          "osman"));
		System.out.println(RunnerLambda.runLambda(a -> "test2 : " + a,
		                                          "osman"));

		System.out.println(RunnerLambda.runLambda(a -> "test3 : " + a,
		                                          "osman"));

		IVoidIntf intf = (s) -> {
			String string3 = s + " test";
		};

	}

	public static String runLambda(final ILambda lambda, final String data) {
		return lambda.test(data);
	}
}

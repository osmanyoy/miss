package com.java.features.eight;

public interface IMyInterface {

	public static final int CONSTANT1 = 100;
	public static final int CONSTANT2 = 200;

	String process(String str);

	default String testMe(final String str) {
		return this.process(str) + " process i çaðýrdým";
	}

	public static String staticMethod(final String str) {
		return "Static " + str;
	}

}

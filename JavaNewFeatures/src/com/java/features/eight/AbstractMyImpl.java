package com.java.features.eight;

public abstract class AbstractMyImpl extends MyMustExtend {

	public abstract String process(String str);

	public String testMe(final String str) {
		return this.process(str) + " process i çaðýrdým";
	}

}

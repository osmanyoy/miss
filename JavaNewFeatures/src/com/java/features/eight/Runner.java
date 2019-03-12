package com.java.features.eight;

public class Runner {
	public static void main(final String[] args) {
		IMyInterface im = new MyImpl8();
		String testMe = im.testMe("osman");
		System.out.println(testMe);

		String staticMethod = IMyInterface.staticMethod("static call");
		System.out.println(staticMethod);

		MyImpl7 myImpl7 = new MyImpl7();
		String testMe2 = myImpl7.testMe("osman");
		System.out.println(testMe2);

	}
}

package com.java.features.eight.lambda;

public class Runner {
	public static void main(final String[] args) {
		final String string = "test";

		IHelp help = new IHelp() {

			@Override
			public String help() {
				// TODO Auto-generated method stub
				return string;
			}
		};

		System.out.println(help.help());
	}
}

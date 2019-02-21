package com.training.patterns.creational.singleton;

public enum ESingleton {
	Instance(100), Instance2(200) {

		@Override
		public String hello() {
			return "hello world instance 2";
		}

	};

	private final int val;

	private ESingleton(final int val) {
		this.val = val;
	}

	public String hello() {
		return "hello world";
	}

	public int getVal() {
		return this.val;
	}

}

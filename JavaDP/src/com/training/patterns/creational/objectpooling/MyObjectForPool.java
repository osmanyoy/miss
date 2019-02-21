package com.training.patterns.creational.objectpooling;

public class MyObjectForPool extends MyObject {
	private ObjectPool objectPool;
	private MyObject myObject;

	public MyObjectForPool(final ObjectPool objectPool, final MyObject myObject) {
		super();
		this.objectPool = objectPool;
		this.myObject = myObject;
	}

	@Override
	public void close() {
		this.objectPool.give(this.myObject);
	}

	@Override
	public void test1() {
		this.myObject.test1();
	}

	@Override
	public void test2() {
		this.myObject.test2();
	}

	@Override
	public void test3() {
		this.myObject.test3();
	}

	@Override
	public void test4() {
		this.myObject.test4();
	}

	@Override
	public void test5() {
		this.myObject.test5();
	}

}

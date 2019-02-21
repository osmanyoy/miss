package com.training.patterns.creational.objectpooling;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ObjectPool {
	private BlockingQueue<MyObject> myObjects = new ArrayBlockingQueue<>(100);

	public ObjectPool() {
		for (int i = 0; i < 10; i++) {
			MyObject myObject = new MyObject();
			MyObjectForPool myObjectForPool = new MyObjectForPool(this, myObject);
			this.myObjects.add(myObjectForPool);
		}
	}

	public MyObject getMyObject() throws InterruptedException {
		return this.myObjects.take();
	}

	public void give(final MyObject myObject) {
		this.myObjects.add(myObject);
	}
}

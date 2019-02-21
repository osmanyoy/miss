package com.training.patterns.creational.builder;

public class SendAPI {

	public void start(final StartObj so) {
		System.out.println("Sent to " + so.getIp() + "/" + so.getPort());
	}

	public void start(final StartObj2 so) {
		System.out.println("Sent to " + so.getIp() + "/" + so.getPort());
	}

}

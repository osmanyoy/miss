package com.training.patterns.behavioral.memento;

public class Memento {
	private String cookie;
	private String name;
	private long counter;

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(final String cookie) {
		this.cookie = cookie;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public long getCounter() {
		return this.counter;
	}

	public void setCounter(final long counter) {
		this.counter = counter;
	}

}

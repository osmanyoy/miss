package com.training.patterns.creational.builder;

public class StartObj2 {
	public String ip;
	public String ipExtra;
	public int port;
	public int portExtra;
	public String xyz;

	public StartObj2(final String ip, final String ipExtra, final int port, final int portExtra) {
		super();
		this.ip = ip;
		this.ipExtra = ipExtra;
		this.port = port;
		this.portExtra = portExtra;
	}

	public StartObj2(final String ip, final int port) {
		super();
		this.ip = ip;
		this.port = port;
	}

	public String getIp() {
		return this.ip;
	}

	public String getIpExtra() {
		return this.ipExtra;
	}

	public int getPort() {
		return this.port;
	}

	public int getPortExtra() {
		return this.portExtra;
	}

}

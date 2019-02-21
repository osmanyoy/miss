package com.training.patterns.creational.builder;

public class StartObj {
	public String ip;
	public String ipExtra;
	public int port;
	public int portExtra;
	public String xyz;

	private StartObj() {
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

	public static StartObjBuiler getBuilder() {
		return new StartObjBuiler();
	}

	public static class StartObjBuiler {
		private StartObj startObj = new StartObj();

		private StartObjBuiler() {
		}

		public StartObjBuiler withIp(final String ip) {
			this.startObj.ip = ip;
			return this;
		}

		public StartObjBuiler withXyz(final String xyz) {
			this.startObj.xyz = xyz;
			return this;
		}

		public StartObjBuiler withIpExtra(final String ipExtra) {
			this.startObj.ipExtra = ipExtra;
			return this;
		}

		public StartObjBuiler withPort(final int port) {
			this.startObj.port = port;
			return this;
		}

		public StartObjBuiler withPortExtra(final int portExtra) {
			this.startObj.portExtra = portExtra;
			return this;
		}

		public StartObj build() {
			// Validations
			return this.startObj;
		}
	}

}

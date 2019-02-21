package com.training.patterns.creational.builder;

public class Runner {
	public static void main(final String[] args) {
		SendAPI sendAPI = new SendAPI();
		StartObj so = StartObj.getBuilder()
		                      .withIp("19171717")
		                      .withPort(1300)
		                      .withIpExtra("19171718")
		                      .withPort(1301)
		                      .withXyz("sdsjhd")
		                      .build();
		sendAPI.start(so);

		// I am creating XYZ version of
		StartObj2 so2 = new StartObj2("19171717", "19171718", 1200, 1300);
		sendAPI.start(so2);
	}
}

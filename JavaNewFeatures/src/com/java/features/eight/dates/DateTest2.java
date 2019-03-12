package com.java.features.eight.dates;

import java.time.Instant;

public class DateTest2 {
	public static void main(final String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant.getEpochSecond());

		Instant ofEpochSecond = Instant.ofEpochSecond(100);
		System.out.println(ofEpochSecond);

	}
}

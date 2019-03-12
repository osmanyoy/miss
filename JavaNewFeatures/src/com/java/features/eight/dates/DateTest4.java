package com.java.features.eight.dates;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTest4 {
	public static void main(final String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDateTime minusYears = dateTime1.minusYears(1);
		LocalDateTime with = minusYears.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		LocalDateTime dateTime2 = LocalDateTime.now();
		System.out.println(with);
	}
}

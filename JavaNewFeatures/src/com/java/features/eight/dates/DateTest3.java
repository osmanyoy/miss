package com.java.features.eight.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

public class DateTest3 {
	public static void main(final String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.now();
		LocalDateTime minusDays = dateTime2.minusDays(2);

		Duration duration = Duration.between(dateTime1,
		                                     minusDays);
		System.out.println(TimeUnit.MILLISECONDS.convert(duration.getSeconds(),
		                                                 TimeUnit.SECONDS));

		Period period = Period.between(LocalDate.now(),
		                               LocalDate.now()
		                                        .minusDays(10));

		System.out.println(period);
	}
}

package com.java.features.eight.dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateTest {
	public static void main(final String[] args) {
		long convert = TimeUnit.MINUTES.convert(1,
		                                        TimeUnit.DAYS);
		System.out.println(convert);
		Date date = new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.add(Calendar.DAY_OF_MONTH,
		                      1);
		gregorianCalendar.set(Calendar.MINUTE,
		                      45);
		gregorianCalendar.set(Calendar.HOUR_OF_DAY,
		                      5);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		System.out.println(dateFormat.format(gregorianCalendar.getTime()));

		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2015,
		                                    3,
		                                    12);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_DATE_TIME;

		LocalDate localDate3 = LocalDate.parse("13-03-2017",
		                                       dateTimeFormatter);
		localDate3.plusDays(2);
		localDate3.minusMonths(3);

		int dayOfMonth = localDate3.getDayOfMonth();
		Month month = localDate3.getMonth();
		int year = localDate3.getYear();
		int monthValue = localDate3.getMonthValue();

		System.out.println(localDate3);

		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = LocalTime.of(5,
		                                    45);
		LocalDateTime atDate = localTime2.atDate(localDate3);
		LocalDate localDate = atDate.toLocalDate();

		LocalDateTime localDateTime = LocalDateTime.now();

		Instant instant = Instant.now();
		System.out.println(instant);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();

	}
}

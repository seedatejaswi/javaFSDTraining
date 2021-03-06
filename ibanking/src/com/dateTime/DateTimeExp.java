package com.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeExp {
	public static void main(String args[]) {

		LocalTime localTime = LocalTime.now();
		System.out.println("localTime is " + localTime);

		LocalDate localDate = LocalDate.now();
		System.out.println("local Date is " + localDate);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String date = localDate.format(myFormatObj);
		System.out.println("date is " + date);
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		String date1 = localDate.format(myFormatObj1);
		System.out.println("Date 2 format is " + date1);
		
		   LocalTime t= LocalTime.now(ZoneId.of("Asia/Tokyo"));
		   System.out.println("current time europe is " + t);

		
	}
}

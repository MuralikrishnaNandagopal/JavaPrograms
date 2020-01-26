package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateEx {
	
	public static void main (String args []) {
		
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("LocalDateTime.now() --->  " + currentTime);
		 
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("currentTime.toLocalDate()  -->  " + date1);
		 
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		 
		System.out.println("currentTime.getMonth() --> : " + month +"        currentTime.getDayOfMonth() -->  " + day +"         currentTime.getSecond() -->  " + seconds);
		 
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("currentTime.withDayOfMonth(10).withYear(2012) -->  " + date2);
		 
		//12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("LocalDate.of(2014, Month.DECEMBER, 12 -->  " + date3);
		 
		//22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("LocalTime.of(22, 15) -->  " + date4);
		 
		//parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("LocalTime.parse(\"20:15:30\") -->  " + date5);
		 
		ZonedDateTime date11 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("ZonedDateTime.parse(\"2007-12-03T10:15:30+05:30[Asia/Karachi]\")  -->  " + date11);
		 
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId.of(\"Europe/Paris\") -->  " + id);
		 
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("ZoneId.systemDefault()  -->  " + currentZone);
		 

	}

}

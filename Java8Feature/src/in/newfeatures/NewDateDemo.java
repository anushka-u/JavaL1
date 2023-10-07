package in.newfeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(3);
		System.out.println(date);
		
		boolean leapYear = LocalDate.parse("2020-10-12").isLeapYear();
		System.out.println(leapYear);
		
		date = date.plusYears(4);
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		
		
	}

}

package java_basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {

	public static void main(String[] args) {

		LocalDate strdate = LocalDate.parse("10-10-2000", DateTimeFormatter.ofPattern("dd-MM-uuuu"));

		LocalDate enddate = LocalDate.parse("11-04-2022", DateTimeFormatter.ofPattern("dd-MM-uuuu"));

		long Days = ChronoUnit.DAYS.between(strdate, enddate);

		System.out.println("number of days:" + Days);
	}

}

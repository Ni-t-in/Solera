package dayfive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateImplementation {

	public static void main(String[] args) {
		System.out.println("Today " + LocalDate.now());
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tommorow = date.plusDays(1);
		System.out.println("Yesterday " + yesterday);
		System.out.println("Tommorow " + tommorow);
		System.out.println(date.isLeapYear());
		
		//Make new date
		
		LocalDate leapYear = LocalDate.of(2020, 9, 05);
		System.out.println(leapYear.isLeapYear());
		
		//Date with time
		
		LocalDate dateTime = LocalDate.of(2015, 5, 15);
		System.out.println(dateTime);
		
		LocalDateTime dateWithTime = dateTime.atTime(1,50,9);
		System.out.println(dateWithTime);
		
		//FOrmatter
		
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		
		//Making object
		
		String dateString = "2022-09-20";
		
		LocalDate parsedDate = LocalDate.parse(dateString);
		System.out.println(parsedDate);
		
		

	}

}

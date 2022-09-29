package dayfive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendarImplementation {

	public static void main(String[] args) {
		
		Date dateOne = new Date();
		System.out.println(dateOne);
		
		Date dateTwo = new Date(999999999999L);
		System.out.println(dateTwo);
		
		System.out.println(dateTwo.before(dateOne));
		
		System.out.println(dateTwo.after(dateOne));
		
		System.out.println("Seconds " + dateOne.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd-MM-yy");
		String liveDate = sdf.format(dateOne.getTime());
		System.out.println("Date Format" + liveDate);
		
		String[] date = sdf.format(dateOne.getTime()).split(" ");
		
		for(String x : date) {
			System.out.println("Splitted " + x);
		}
		
		System.out.println("Converting string into date object");
		
		Date objDate = null;
		try {
			objDate = sdf.parse(liveDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(objDate);
		
		Calendar smpCalendar = Calendar.getInstance();
		Date cldDate = smpCalendar.getTime();
		System.out.println(cldDate);
		System.out.println(sdf.format(cldDate));
		
		Calendar cld = new GregorianCalendar(2022,9,27,10,21,58);
		System.out.println("Year : " + cld.get(Calendar.YEAR));
		System.out.println("Month : " + cld.get(Calendar.MONTH));
		System.out.println("Day of month : " + cld.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week : " + cld.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Set date manually");
		
		Calendar gec = new GregorianCalendar(2022,8,7,10,52,54);
		System.out.println(sdf.format(gec.getTime()));
		
		
	}

}

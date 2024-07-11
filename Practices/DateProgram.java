package Practices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

  

public class DateProgram {

	public static void main(String[] args) throws ParseException {
        String dateString = "11 July 2024";
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = inputFormat.parse(dateString);
		String result = outputFormat.format(date);
		System.out.println(dateString  + " Convert Into : " +  result);     
        System.out.println("----------------");
        
        String s = "11-07-2024";
        SimpleDateFormat input = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat output = new SimpleDateFormat("dd MMMM yyyy");
        Date date2 = input.parse(s);
        String result2 = output.format(date2);
		System.out.println(s  + " Convert Into : " +  result2);     
        System.out.println("----------------");
        
        
	}
}


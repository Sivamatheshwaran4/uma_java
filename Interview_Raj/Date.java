package Interview_Raj;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	public void show () throws ParseException {
		String dateString = "13 Feb 2018";
		
		SimpleDateFormat inputFormat = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = inputFormat.parse(dateString);
		String result = outputFormat.format(date);
		System.out.println(dateString  + " Convert Into : " +  result);
		
	}
	public static void main(String[] args) throws ParseException {
		Date obj = new Date();
		obj.show();
		
	}

}

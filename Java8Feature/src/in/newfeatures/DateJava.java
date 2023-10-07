package in.newfeatures;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateJava {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		
		//Covert string to date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-mm-dd");
		Date parsedDate = sdf3.parse("2012-09-07");
		System.out.println(parsedDate);
	}

}

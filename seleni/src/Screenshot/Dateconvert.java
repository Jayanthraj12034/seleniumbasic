package Screenshot;

import java.util.Date;

public class Dateconvert {
	public static void main(String[] args) {
		
		Date date=new Date();
		
		String ts = date.toString();
		String currentdate = ts.replaceAll(":", "-");
		
		System.out.println(currentdate);
		
		
		
		
	}

}

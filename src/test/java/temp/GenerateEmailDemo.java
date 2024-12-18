package temp;

import java.util.Date;

public class GenerateEmailDemo {
	
	public static void main(String[] args) {
		Date date  = new Date();
		String datestring = date.toString();
		String nospaceDateString = datestring.replaceAll("\\s", "");
		String noSpaceAndnoColonsDateString = nospaceDateString.replaceAll("\\:", "");
		String emailWithTimeStamp = noSpaceAndnoColonsDateString+"@gmail.com";
		System.out.println(emailWithTimeStamp);
	}

}

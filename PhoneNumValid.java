

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumValid {
	public static void main(String[] args) {

		
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.print("Enter Phone Number : "); long phone = scan.nextLong();
		  
		  String phoneString = Long.toString(phone);
		 /* 
		 * if (phoneString.length() == 10 && phoneString.charAt(0) >= '6' &&
		 * phoneString.charAt(0) <= '9') {
		 * System.out.println("Entered Phone Number is Valid"); } else if
		 * (phoneString.length() == 10) {
		 * System.out.println("First Digit of the Indian Phone Number must be greater "
		 * + "than or equal to '6' and Lesser than or equal to '9'"); } else {
		 * System.out.println("Indian Phone Number must Contain 10 digits"); }
		 * scan.close();
		 */
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}",phoneString ));
	}
}

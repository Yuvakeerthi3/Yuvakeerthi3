

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValid {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		System.out.println(Pattern.matches("[a-zA-Z9-0]{}[@]{1}[a-zA-Z]{}[.][1}[a-zA-Z]", email));
		sc.close();
	}

}

package net.practice;

public class Loops3 {
	public static void main(String[]args)
	{
	/*	int a = 20;
		do {
			System.out.print(a+" ");
			a--;
		} while (a > 0);    */
		
		
		
		
		int k = 3;
		do {
			do {
				System.out.println(k + 1);
				++k;
			} while (k <= 5); // at end k=6
		
			System.out.println(k); // k=6
			k--;

		} while (k >= 3);     
			
	
		
		
	}

}

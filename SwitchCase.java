package net.practice;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int test = sc.nextInt();
		int a = 10, b = 15;
		switch (test) {
		case 1:
			System.out.println("add = " + (a + b));
     
		case 2:
			System.out.println("sub = " + (a - b));
			break;
		case 3:
			System.out.println("mul = " + (a * b));
			break;
		case 4:
			System.out.println("Div = " + (a / b));

		default:
			System.out.println(a);
		}

		sc.close();
	}

}

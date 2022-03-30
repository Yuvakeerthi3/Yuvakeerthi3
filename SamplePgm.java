package com.exercise.in;

import java.util.Scanner;

public class SamplePgm {
	public static void main(StringTest[] args) {
		int n = 5;
		int fact = 1;
		do {
			fact = fact * n;
			n--;
		} while (n > 0);
		System.out.println(fact);

// ARMSTRONG NUMBER...............
		int d1, d2, d3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int temp = num;
		d1 = temp % 10;
		temp = temp / 10;
		d2 = temp % 10;
		temp = temp / 10;
		d3 = temp % 10;
		temp = temp / 10;
		int result = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
		if (num == result)
			System.out.println("armstrong number........");
		sc.close();

//MULTIPLICATION TABLES......................
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num1 = sc.nextInt();
		System.out.println("enter the limit");
		int limit = scan.nextInt();
		for (int i = 1; i <= limit; i++) {
			System.out.println(num1 + "*" + i + "=" + (i * num1));
		}
		scan.close();

//BETWEEN PRIME NUMBERS...............
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)

					count++;
			}
			if (count == 2)
				System.out.println("primenumber =" + i);
			count = 0;
		}

	}
}

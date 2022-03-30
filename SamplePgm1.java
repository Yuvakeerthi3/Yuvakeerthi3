package com.exercise.in;

import java.util.Scanner;

public class SamplePgm1 {
	public static void main(StringTest[] args) {
//PERFECT NUMBER................
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("enter the number...");
			int s = sc.nextInt();
			int sum = 0;
			for (int i = 1; i < s; i++) {
				if (s % i == 0)
					sum += i;
			}
			if (sum == s)
				System.out.println("perfect number");
			else
				System.out.println("not a perfect numnber");
		}
		sc.close();
//STRONG NUMBER................
		int n = 145;
		int rem = 0, fact = 0, summ = 0;
		int num = n;
		while (n > 0) {
			rem = n % 10;
			fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			summ += fact;
			n = n / 10;
		}
		if (summ == num)
			System.out.println("strong number...");
		else
			System.out.println("not a strong number...");
	}

}
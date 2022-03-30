package com.exercise.in;

import java.util.Scanner;

public class ArrayTest {
	public void oneDimensional() {
		int a[] = { 1, 2, 3 };
		for (int h : a) {
			System.out.print(h + " ");
		}

		int c[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {

			System.out.println("enter the input");
			c[i] = sc.nextInt();
		}
		sc.close();
		for (int k : c) {
			System.out.println(k);
		}

	}

	public void twoDimensional() {
		int p[][] = { { 1, 3, 6 }, { 5, 7, 0 }, { 4, 8, 1 } };
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j]);
			}
			System.out.println();
		}

	}

	public void threeDimensional() {
		int x[][][] = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int y[][] : x) {
			for (int z[] : y) {
				for (int w : z) {
					System.out.print(w + " ");
				}
				System.out.println();
			}
		}

	}

	public void jaggedArray() {

		int h[][] = new int[][] { { 1, 2 }, { 5, 7, 3 }, { 3, 0, 8, 1, 2 } };
		for (int g[] : h) {
			for (int f : g) {
				System.out.print(f + " ");
			}
			System.out.println();
		}
	}

	public void ascii() {
		for (int i = 0; i < 90; i++) {
			System.out.println("ascii :" + i + " " + (char) (i));
		}
	}

	public static void main(StringTest[] args) {
		ArrayTest obj = new ArrayTest();
		obj.oneDimensional();
		obj.twoDimensional();
		obj.threeDimensional();
		obj.jaggedArray();
		obj.ascii();

	}

}

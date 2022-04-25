package net.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[] = new int[sc.nextInt()];
		int n = arr.length;
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
				
		int length =0;
		
		int[] ar = new int[n];
		
		for (int i = 0; i < n - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				ar[length] = arr[i];
				length++;
			}
		}
		ar[length] = arr[n - 1];
		length++;
		System.out.println("After removing duplicate elements  ");
		for (int i = 0; i < length; i++) {
			System.out.println(ar[i]);
		}
	}
}

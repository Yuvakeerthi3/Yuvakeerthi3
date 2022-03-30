package com.exercise.in;

import java.util.Arrays;

public class SamplePgm2 {
	public static void main(StringTest[] args) {
		int[] a = new int[] { 2, 6, 1, 8, 67, 55,6,2 };
		System.out.println("elements in the array  :" + Arrays.toString(a));
//EVEN ODD NUMBER...................
		int even = 0, odd = 0;
		for (int num : a) {
			if (num % 2 == 0) {
				even++;
				System.out.println("even number :" + num);
			} else {
				odd++;
				System.out.println("odd number :" + num);
			}
		}
		System.out.println("TOTAL EVEN NUMBERS :" + even);
		System.out.println("TOTAL ODD NUMBERS :" + odd);

		
//ASCENDING DESCENDING NUMBER................
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		System.out.println("after ascending :" + Arrays.toString(a));

		for (int j = 0; j < a.length; j++) {
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("after descending :" + Arrays.toString(a));

	
//PUT THE VALUE AT SPECIFIC INDEX.............
		int index=2;
		int value=33;
		for(int k=a.length-1;k<index;k--)
		{
		   	a[i]=a[i-1];
		}
		a[index]=value;
	System.out.println("After modify :"+Arrays.toString(a));
	}
	

//DUPLICATE VALUE OF ARRAY..........
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.println("Duplicate values :" + a[j]);
				}
			}
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	}

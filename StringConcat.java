import java.util.Arrays;
import java.util.Scanner;

/*
 * STEP 1: get the two input array using Scanner and loop
 * STEP 2: add the length of two array 
 * STEP 3: create new array for display elements and variable for index in new array
 * STEP 4: using for loop get elements in first array and add into new array
 * STEP 5: using another for loop and add the elements in new array
 * Step 6: print the new array
 */
public class StringConcat {
	public static void main(String[] args) {
		int p = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int len = sc.nextInt(); // 3
		int arr1[] = new int[len];
		System.out.println("Enter the elements ");
		for (int i = 0; i < len; i++) {
			arr1[i] = sc.nextInt(); // 1,2,3
		}
		System.out.println("Enter the size of second array");
		int len1 = sc.nextInt(); // 3
		System.out.println("Enter the elements ");
		int arr2[] = new int[len1];
		for (int i = 0; i < len1; i++) {
			arr2[i] = sc.nextInt(); // 4,5,6
		}
		int length = arr1.length + arr2.length; // 6
		int result[] = new int[length];
		for (int res : arr1) {
			result[p] = res; // 1 ,2 ,3
			p++; // 0 ,1 ,2
		}
		for (int res : arr2) {
			result[p] = res; // 1,2,3,4, 5, 6
			p++; // 3 , 4 , 5
		}
		System.out.println("After concat the two arrays " + Arrays.toString(result)); // 1,2,3,4,5,6
		sc.close();
	}

}

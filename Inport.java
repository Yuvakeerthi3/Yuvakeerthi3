import java.util.Arrays;

public class Inport {
public static void main(String[]args)
	{
		int num1[] = new int[] { 1, 3 };
		int num2[] = new int[] { 2 , 4 };
		int length = num1.length + num2.length;
		int arr[] = new int[length];
		int p = 0;int half=arr.length/2;
		double s=0;
		double sum=0;
		//for (int i = 0; i < num1.length; i++) {
			//arr[p] = num1[i];
			//p++;
	//	}
		
//		for (int j = 0; j < num2.length; j++) {
	//		arr[p] = num2[j];
		//	p++;
		//}
		
		System.arraycopy(num1, 0, arr, 0, num1.length);
        System.arraycopy(num2, 0, arr, num1.length, num2.length);
        Arrays.sort(arr);
		for(int merge:arr)
		{
			System.out.println(merge);
		}
		
		if(arr.length%2!=0)
		{
			s=arr[half];
		    System.out.println("Median is ="+s);
		}
		else
		{ 
		  sum=(arr[half]+arr[half-1]);
		  System.out.format("%.2f", sum);
		  s=sum/2;
		  System.out.println("Median is ="+s);
		  
		}

	}

}
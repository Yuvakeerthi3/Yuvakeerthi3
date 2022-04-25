package net.practice;

public class LessPositiveInteger {
	public static void main(String[]args)
		 {
		int nums[]=new int[] {2,1};
		 int n= nums.length;                //5
	        boolean arr[] = new boolean[n+1]; //
	        
	        for(int i=0; i<n; i++){
	           
	            if(nums[i]>=1 && nums[i]<=n){ //(3>=1 && 3<=n),(4>=4 && 4<=n),- ,(1>=1 &&1<=n)
	                arr[nums[i]-1] = true;   //[0,0,true,0,0] ,[0,0,true,true,0],- , [true,0,true,true,0]         
	            }
	        }
	        int pos=0;
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]==false)
	            {
	                pos= i+1;
	                break;
	            }
	            else if(arr[i]==true)  //[1] ,[2,1]
	            {
	                pos=i+2;
	            }
	        } 
	        System.out.println("Minimum positive Integer ="+pos);
		    }
		}
		     

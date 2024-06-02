package com.rajcoding;

import java.util.Arrays;

public class SqOfSortArr 
{  
	
	public static int[] sortedSquares(int[] nums) 
    {
        int i=0;
        int n=1;
        while(i<nums.length)
        {
        	n=nums[i]*nums[i];
        	nums[i]=n;
        	//System.out.println(nums[i] + "\n");
        	i++;
        }
        Arrays.sort(nums);
        return nums;
        
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] nums = {-4,-1,0,3,10};
		//int n[] = new int[5];
		nums = sortedSquares(nums);
		System.out.println("Sorted Array is " );
	    for (int i = 0;i<nums.length;i++)
	    	System.out.println(nums[i] + "\n");
		

	}

}

package com.rajcoding;

public class EvenNoOfDigits 
{
	public static int findNumbers(int[] nums) 
    {
        int count = 0;
        int n=0;
        int num = 0;
        
        if(nums.length == 0)
        	return 0;
        
        for (int i=0; i<nums.length;i++)
        {
        	n=nums[i];
        	while(n!=0)
        	{
        		n=n/10;
        		count++;
        	}
        	
        	if(count%2 == 0)
        	{
        		System.out.println("Even digit No is "+ nums[i]);
        		num++;
        	}    
        	
        	count = 0;
        }
        
        
        return num;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] nums = {12,345,2,6,7896};
		
		System.out.println("Even No Of Digits are " + findNumbers(nums));

	}

}

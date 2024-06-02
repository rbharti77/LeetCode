package com.rajcoding;

public class MaxConOnes 
{
	
   static int findMaxConsecutiveOnes(int[] nums) 
    {
      int count = 0;
      int maxcount = 0;
      int n = nums.length;
      int i = 0;
      
      
      for(i=0;i<n;i++)
      {
          if(nums[i]==0)
              count++;
      }
       if(count == n)
           return 0;
        
       // For best case if all are zeros then
       count = 1;
      for (i= 1;i<n;i++)
      {
    	  System.out.println("Trace I is " + i + " NUM is " + nums[i] + " MaxCount is " + maxcount + " Count is " + count  );
    	  if(nums[i]==nums[i-1] && nums[i] == 1)
    		  count++;
    	  else
    	  {
    		  if(maxcount < count)
    		  {
    			  maxcount = count;
    			  
    		  }
    		  count = 1;
    	  }
      }
    	  
      
      // For last index because without below condition it work fine for {1,1,0,1,1,1,0,1,1} but failed for {1,1,0,1,1,0,1,1,1} 
      
      if (i == n && maxcount < count)
    	   maxcount = count;
	return maxcount;
	
	
     }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int arr[] = {1,1,0,1,1,0,1,1,1};
        System.out.println("Max consecutive 1's are " + findMaxConsecutiveOnes(arr));
	}

}

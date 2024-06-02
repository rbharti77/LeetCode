package com.rajcoding;

public class FastMaxConOnes {
    
    // Returns count of maximum consecutive 1's
    // in binary array arr[0..n-1]
    static int getMaxLength(int nums[])
    {
        int n = nums.length; 
        int count = 0; //intitialize count
        int result = 0; //initialize max
      
        for (int i = 0; i < n; i++)
        {
              
            // Reset count when 0 is found
            if (nums[i] == 0)
                count = 0;
      
            // If 1 is found, increment count
            // and update result if count becomes
            // more.
            else
            {
                count++;//increase count
                result = Math.max(result, count);
            }
        }
      
        return result;
    }
      
    // Driver method
    public static void main(String[] args)
    {
       int arr[] = {1,1,0,1,1,0,1,1,1};
                             
        System.out.println(getMaxLength(arr));
    }
}

package com.rajcoding;


public class MyMergSortArr 
{
	 public void merge(int[] nums1, int m, int[] nums2, int n) 
	    {   
		 m--; n--;
         int index = nums1.length-1;
		 
		   while(index>=0) 
	        {  
	            
	        	if(m<0)
	        	{
	        	    nums1[index]=nums2[n--];	
	        	}
	        	else if(n<0)
	        	{
	        		nums1[index] = nums1[m--];
	        	}
	        	else
	        	{
	        	 if (nums1[m]<nums2[n])
	        	  {
	        		nums1[index]=nums2[n--];	
	        	  }
	        	 else
	        	 {
	        		 nums1[index]=nums1[m--];
	        	 }
	        	}
	        	index--;
	        }
	        
	        
	        System.out.println("Sorted  Array2 is ");
	        for (int z :nums1)
	        	System.out.print(z+",");
	    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		int m=nums1.length;
		int n=nums2.length;
		MyMergSortArr mmsa = new MyMergSortArr();
		mmsa.merge(nums1, 3, nums2, n);
		

	}

}

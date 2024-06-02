package com.rajcoding;

public class TestBinary {
	
	
	 static int find(int b[],int x)
	{
		int mid =0 ;
		
		if(b.length ==1 || b.length ==0)
		{ 
			mid = 0;
			return mid;
	    }
		
		int left = 0;
		int right = b.length;
		
		while(left <= right)
		{
			mid = (left+right)/2;
			if(b[mid] == x)
			{
				return mid;
			}
			else 
			{
				if(b[mid]<x)
				{
					left = mid +1;
				}
				else
				{
					right = mid -1;
				}
			}
		}
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,5,7,9,10};
		int x = 9;
		System.out.println("Element is at " + find(a,x));

	}

}

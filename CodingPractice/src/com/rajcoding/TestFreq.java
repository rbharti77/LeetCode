package com.rajcoding;

import java.util.Arrays;

public class TestFreq {
	
	public static void frequency(int a[],int n)
	{
	boolean visited[] = new boolean[n];
	 Arrays.fill(visited, false);
	 if (n==0)
		 return;
	 int i = 0;
	 int count = 0;
	 while(i< a.length)
	 {   
		 count = 1;
		 if(visited[i]==true)
		 {   i++;
			 continue;
		 }
		 
		 for(int j = i+1; j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 visited[j]=true;
			      count++;
			 }
			 
		 }
		 System.out.println("Number is " + a[i]);
		 System.out.println("Count is " + count);
		 i++;
	 }
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,1,2,3,5,3,2,2,3};
	    frequency(a,10);

	}

}

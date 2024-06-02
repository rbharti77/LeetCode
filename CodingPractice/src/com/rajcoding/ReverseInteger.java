package com.rajcoding;

public class ReverseInteger {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int x = -123;
		int x= 1534236469;
		int y=0,z=0,count = 0, sign=1;
		//x*= x<0 ?-1:1;
		if (x<0)
		{
			x*=-1;
			sign = -1;
		}
		while (x!=0)
		{ 
			y = x%10;
			x=x/10;
			if(count ==0)
			{	z=y;
			count++;
			}
			else
				z=concat(z,y);
		}
		z*=sign;
		System.out.println("Number is " + z);

	}
	
	static int concat(int a, int b)
    {
  
        // Convert both the integers to string
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
  
        // Concatenate both strings
        String s = s1 + s2;
  
        // Convert the concatenated string
        // to integer
        int c = Integer.parseInt(s);
  
        // return the formed integer
        return c;
    }

}

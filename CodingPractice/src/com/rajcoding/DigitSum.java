package com.rajcoding;

public class DigitSum {
	
	
	static int getSum(int n)
	{
		int sum = 0;
		while (n!=0)
		{
			sum = sum + n % 10;
			
			System.out.println("Sum is " + sum);
			n= n /10;
			
			System.out.println("Num is " + n);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 279;
		
		//DigitSum s = new DigitSum();
		//Here above no need of argument because method itself declared as static
		
		
		System.out.println(getSum(n));
		
		
	}

}

package com.ocjpraj;

public class Test3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		double d = 12.345;
		//System.out.println("|%7f|",d); // Here we can't use println 
		//System.out.printf("|%7d|",d); //If we uncomment this then -->> Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
		System.out.printf("|%7.3f|",d); // Before executing this predict the output.

	}

}

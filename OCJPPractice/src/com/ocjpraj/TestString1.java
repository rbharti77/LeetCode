package com.ocjpraj;

public class TestString1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s[] = {"Ram","Sita"};
		String r = "Ram";
		String t = new String("Ram");
		
		System.out.println(s[0]==r);// Very useful concept
		
		String a1 = "Ram";
		String a2 = a1+"Sita";
		String a4 = a1.concat("Sita");
		System.out.println(a2);
		
		String a3 = "RamSita";
		System.out.println(a2==a3);
		System.out.println(a4==a3);
		System.out.println(a3.length());
		
		int a[] = {1,2,3};
		System.out.println(a.length);

	}

}

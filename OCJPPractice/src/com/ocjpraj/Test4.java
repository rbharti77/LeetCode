package com.ocjpraj;

class Money
{
	public String country = "Canada";
	public String getC(){return country;}
}

class Yen extends Money
{ 
	public String getC() {return super.country;}
}

public class Test4 extends Money {
	public String getC(int x) {return super.getC();}

	public static void main(String[] args) 
	{
		System.out.println(new Yen().getC()+ " " +  new Test4().getC());// TODO Auto-generated method stub

	}

}

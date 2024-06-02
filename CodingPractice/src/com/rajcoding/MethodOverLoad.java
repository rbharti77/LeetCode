package com.rajcoding;




 class A
{  
	 final static int x = 10;
	
	public void display()
	{
		System.out.println("Parent");
	}
}
 
class B extends A
{
	public final void display()
	{
		System.out.println("Child");
	}
}


public class MethodOverLoad 
{
   public static void main(String[] args)
   {
	   A a = new A();
	   B b = new B();
	  //b.display();
	   
	   
	  
	   
   }
}

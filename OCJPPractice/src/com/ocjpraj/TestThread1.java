package com.ocjpraj;

import com.ocjpraj.TestThread1;

public class TestThread1 
{
   public static void main(String[] args)
   {
	   new TestThread1().go();
   }
   
   public void go()
   {
	   Runnable r = new Runnable()
		{ 
		   public void run()
		   {
			   System.out.print("foo");
		   }
		   
		   
		};
		
		Thread t = new Thread(r);
		System.out.print("zoo");
		t.start();
   }
}

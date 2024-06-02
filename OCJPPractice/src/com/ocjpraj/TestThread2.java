package com.ocjpraj;

import com.ocjpraj.TestThread2;

public class TestThread2 implements Runnable 
{
   public void run()
   {
	   System.out.println("Run");
	   throw new RuntimeException("Problem");
   }
   
   public static void main(String[] args)
   {
	   Thread t = new Thread(new TestThread2());
	   t.start();
	   System.out.println("End of Method");
   }
}

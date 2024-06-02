package com.rajcoding;

public class TestThread2 implements Runnable 
{
   public void run()
   {
	   System.out.println("Run");
	   
	   //throw new RuntimeException("Problem");
   }
   
   public static void main(String[] args) throws InterruptedException
   {
	   Thread t = new Thread(new TestThread2());
	   t.start();
	   System.out.println("Before Sleep");
	   t.sleep(0);
	   System.out.println("End of Method");
   }
}

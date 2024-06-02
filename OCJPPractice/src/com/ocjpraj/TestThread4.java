package com.ocjpraj;


class threadd implements Runnable
{
    public void run()
    {
        // moving thread2 to timed waiting state
        try
        {   
        	System.out.println("Sleep1 in thread2");
            Thread.sleep(15);
            System.out.println("After Sleep1 in thread2");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
          
        System.out.println("State of thread1 while it called join() method on thread2 -"+
            TestThread4.thread1.getState());
        try
        {
        	System.out.println("Sleep2 in thread2");
            Thread.sleep(200);
            System.out.println("After Sleep2 in thread2");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }     
    }
}



public class TestThread4 implements Runnable
{
    public static Thread thread1;
    public static TestThread4 obj;
      
    public static void main(String[] args)
    {
        obj = new TestThread4();
        thread1 = new Thread(obj);
          
        // thread1 created and is currently in the NEW state.
        System.out.println("State of thread1 after creating it - " + thread1.getState());
        thread1.start();
          
        // thread1 moved to Runnable state
        System.out.println("State of thread1 after calling .start() method on it - " + 
            thread1.getState());
    }
      
    public void run()
    {
        threadd myThread = new threadd();
        Thread thread2 = new Thread(myThread);
          
        // thread1 created and is currently in the NEW state.
        System.out.println("State of thread2 after creating it - "+ thread2.getState());
        thread2.start();
          
        // thread2 moved to Runnable state
        System.out.println("State of thread2 after calling .start() method on it - " + 
            thread2.getState());
          
        // moving thread1 to timed waiting state
        try
        {
            //moving thread1 to timed waiting state
        	System.out.println("Sleep1 in thread1");
            Thread.sleep(1200);
            System.out.println("After Sleep1 in thread1");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method on it - "+ 
            thread2.getState() );
          
          
        try 
        {
            // waiting for thread2 to die
        	System.out.println("join1 in thread1");
            thread2.join();
            System.out.println("After join1 in thread1");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it has finished it's execution - " + 
            thread2.getState());
    }
      
}

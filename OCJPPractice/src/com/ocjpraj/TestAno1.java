package com.ocjpraj;

public class TestAno1 
{   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Runnable r = new Runnable() 
	{
		public void run()
		{
			System.out.println("in Runnable");
		}
	};
	
	Thread t = new Thread(r)
	{
		public void run()
		{
			System.out.println("in Thread");
		}
	};
	

	     t.start();
		//r.start(); It will not work

	}

}

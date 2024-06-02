package com.ocjpraj;

public class TestThread5 extends Thread{  
		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 TestThread5 t1=new TestThread5();  
			 TestThread5 t2=new TestThread5();  
		   
		  t1.start();  
		  t2.start();  
		 }  
		

}

package com.ocjpraj;

import java.io.IOException;
import java.lang.Throwable;



public class TestOperat3 
{   
	 static void fun() throws IOException, ClassNotFoundException
	    {
	        System.out.println("Inside fun(). ");
	        throw new ClassNotFoundException("demo");
	    }
	    public static void main(String args[])
	    {
	        try
	        {
	            fun();
	        }
	        
	        catch(Exception f)
	        {
	            System.out.println("caught in main.");
	        }
	    }

}

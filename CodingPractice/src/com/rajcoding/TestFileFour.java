package com.rajcoding;

import java.io.FileInputStream;

public class TestFileFour {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try
		{
		 FileInputStream fis = new FileInputStream("D:\\TestFile\\Raj.txt");
		 int i;
		 System.out.println("Data in file is ");
		 while((i = fis.read())!=-1)
		 {
			 System.out.print((char)i);
		 }
		 fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}

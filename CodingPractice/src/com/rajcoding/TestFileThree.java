package com.rajcoding;

import java.io.FileOutputStream;

public class TestFileThree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		 FileOutputStream fos = new FileOutputStream("D:\\TestFile\\Raj.txt");
		 String s = "Good Job Keep It up";
		 byte b[] = s.getBytes();// It will convert string into byte array
		 fos.write(b);//Here it will write Good Job Keep it up to file and removes already written data.
		 fos.close();
		 System.out.println("Finally written ---->>>>Good Job Keep It up<<<<----- in Raj.txt file ");
		}		
        catch(Exception e)
		{
        	System.out.println(e);
		}
	}

}

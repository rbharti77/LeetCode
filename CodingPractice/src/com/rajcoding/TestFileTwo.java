package com.rajcoding;

import java.io.FileOutputStream;

public class TestFileTwo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       try
       {
    	   FileOutputStream fos = new FileOutputStream("D:\\TestFile\\Raj.txt");
           fos.write(67);//it will write A to file Raj.txt because 65 is ASCII value of C and before writing it will remove complete content of file.
            fos.close();
            System.out.println("Success");
       }
       catch(Exception e){System.out.println(e);} 
        
        
        
	}

}

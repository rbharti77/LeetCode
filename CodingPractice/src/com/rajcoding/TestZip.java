package com.rajcoding;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class TestZip 
{
   public static void main(String[] args)
   {   
	   
	   try
	   {
		   File file = new File("D:\\TestFile\\du.txt");
		   FileOutputStream fos = new FileOutputStream("D:\\TestFile\\Raj\\Dhiyu.zip");
		   ZipOutputStream zos = new ZipOutputStream(fos);
		   ZipEntry ze = new ZipEntry(file.getName());
		   zos.putNextEntry(ze);
		   byte[] buf = new byte[1024];
	       
		   //File file = new File("D:\\TestFile\\tst.txt");
		   FileInputStream fis = new FileInputStream(file);
		   //ZipInputStream zis = new ZipInputStream(fis); // Will not use this 
	   
		   int length;
	   
		   while((length = fis.read(buf))>=0)
		   {
			   zos.write(buf, 0, length);
			   System.out.println("Data is "+ length);// it will print the data length
		   }
		   
		   System.out.println("Data in file is ");
		   for (byte bt : buf) {  
			      char k = (char) bt;  
			      System.out.print(k);  
			    }  
		  // zis.close();
		   zos.close();
		   fis.close();
		   fos.close();
		   
	   
	   
	   }
	   
	   
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
	   
	   
	   
	   
   }
}

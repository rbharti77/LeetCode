package com.rajcoding;
import java.io.*;
//To read and print the content of data

public class TestFileOne 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("D:\\TestFile\\Taj.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		String st;
		
		
		while((st = br.readLine())!= null)
		{
			System.out.println(st);
		}
		
		System.out.println("File name is " + file.getName());
		
		br.close();
		
	}
	

}

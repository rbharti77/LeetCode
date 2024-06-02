package com.ocjpraj;

public class TestStringBuffer 
{
	public static void main(String[] args) 
	{  
        StringBuffer sb = new StringBuffer();  
        
        int p = sb.length();
        System.out.println("Length of string = " + p);
        //printing default capacity of string buffer  
        System.out.println("default capacity: " + sb.capacity());  
        
        StringBuffer sb1 = new StringBuffer("string buffer");  
        
        int p1 = sb1.length();
        System.out.println("Length of string = " + p1);
        // printing the current capacity of the string buffer i.e. 16 + 13  
        System.out.println("capacity: " + sb1.capacity());  
            
        sb1 = new StringBuffer("A");  
             
        // printing the current capacity of the string buffer i.e. 16 + 1  
        System.out.println("capacity1: " + sb1.capacity()); 
        
        StringBuffer s1 = new StringBuffer("GeeksforGeeks");
        s1.delete(0, 5);
        System.out.println(s1); // returns forGeeks
        s1.deleteCharAt(7);
        System.out.println(s1); // returns forGeek
        
        StringBuffer s2 = new StringBuffer("GeeksforGeeks");
        s2.replace(5, 8, "are"); //*************************************************************
        System.out.println(s2); // returns GeeksareGeeks
        
        
        StringBuffer s = new StringBuffer("GeeksGeeks");
        s.insert(5, "for");
        System.out.println(s); // returns GeeksforGeeks
  
        s.insert(0, 5);
        System.out.println(s); // returns 5GeeksforGeeks
  
        s.insert(3, true);
        System.out.println(s); // returns 5GetrueeksforGeeks
  
        s.insert(5, 41.35d);
        System.out.println(s); // returns 5Getr41.35ueeksforGeeks
  
        s.insert(8, 41.35f);
        System.out.println(s); // returns 5Getr41.41.3535ueeksforGeeks
  
        char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' };
  
        // insert character array at offset 9
        s.insert(2, geeks_arr);
        System.out.println(s); // returns 5Gpawanetr41.41.3535ueeksforGeeks
    }  
}

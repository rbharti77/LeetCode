package com.ocjpraj;

public class TestOperat 
{
	public static void main(String[] args)
    {
        int value = 3, sum = 6 + -- value;
        //int x = 2;
        
        //int data = x++ * 3 + x--;
        //int a=1,b=2,c=3;
        //int data =  a++ + --b + c++;
          
        int data = --value + ++value / sum++ * value++ + ++sum  % value--;
        System.out.println(data + "and" + value );
    }
}

package com.rajcoding;

public class ReverseString 
{

public void reverseString(char[] s) 
{
   char n;
   int i = 0, j = s.length-1;
    while (i<j)
    {
    	n=s[i];
    	s[i]=s[j];
    	s[j]=n;
    	i++;
    	j--;
    }
    
    System.out.println("String is ");
    for (char z : s)
    {
    	System.out.print(z);
    }
   
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		char[] s = {'H','a','n','n','a','h'};
		ReverseString rs = new ReverseString();
		rs.reverseString(s);
		
		

	}

}

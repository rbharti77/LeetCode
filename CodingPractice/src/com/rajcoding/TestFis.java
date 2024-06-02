package com.rajcoding;

class Test 
{
	class TestException extends Exception {} 
    public void runTest() throws TestException {} 
    public void test() throws Exception/* Point X */ 
    { 
        runTest(); 
    } 
}

public class TestFis 
{
	public static void main(String[] args) {
		String s1 = "Raj";
		String s2 = s1.concat("Gos");
		String s3 = "RajGos";
		System.out.println(s2==s3);
		}
}



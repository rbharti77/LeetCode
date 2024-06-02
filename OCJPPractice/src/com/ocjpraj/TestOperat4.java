package com.ocjpraj;

public class TestOperat4 
{
	public Integer sum(Integer a, Integer b) throws RuntimeException {
        return a + b;
    }
 
    // Overloading method
    public Integer sum(Integer a, Integer b, Integer c) throws ArithmeticException 
    {  //Not valid; Compile time error
        return null;
    }
}

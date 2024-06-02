package com.ocjpraj;

//Default behavior of toString() is to print class name, then
//@, then unsigned hexadecimal representation of the hash code
//of the object
//public String toString()
//{
//return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}
//It is always recommended to override toString() method to get our own String representation of Object.

class Student
{}
public class TestToString 
{
	public static void main(String[] args)
	{
		Student s = new Student();
		System.out.println(s); //
		System.out.println(s.toString()); // O/P of both lines are same.
	}

}



package com.ocjpraj;

class Building {}

public class Test2 extends Building {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Building build1 = new Building();
		Test2 test2 = new Test2();
		Test2 test3 = (Test2) build1;
		Object obj1 = (Object) build1;
		//String str1 = (String) build1; // If we uncomment this line then compilation error occurred.
		Building build2 = (Building) test2;
		

	}

}

package com.ocjpraj;

class Animal
{  
	
 /* Animal()
  {
	  System.out.println("animal is created");
  }  */
  
  /*Animal(int x)
  {
	  System.out.println("animal2 is created");
  } */ 
}  
class Dog extends Animal
{  
 /*Dog()
 {  
   //super();  
   System.out.println("dog is created");  
 }  */
 
 Dog(int x)
 {  
   //super();  
   System.out.println("dog2 is created");  
 }  
}  
class TestSuper3
{  
   public static void main(String args[])
   {  
   Dog d=new Dog(5);  
   }
 }  
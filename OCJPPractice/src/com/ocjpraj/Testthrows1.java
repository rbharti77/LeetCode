package com.ocjpraj;

import java.io.IOException;  
import java.lang.ArithmeticException; 

class Testthrows1{  
  void m(){  
    throw new ArithmeticException("device error");//checked exception  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  
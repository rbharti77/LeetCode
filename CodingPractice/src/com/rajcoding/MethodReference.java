package com.rajcoding;

interface Sayable{  
    void say(); 
    //void sayh();
}  
public class MethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = new MethodReference()::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
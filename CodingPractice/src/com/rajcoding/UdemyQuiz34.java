package com.rajcoding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AttributeClass {
    String attribute;
 
    AttributeClass(String attribute) {
        this.attribute = attribute;
    }
 
    public AttributeClass() {
        this("unknown");
    }
 
    public String toString() {
        return attribute;
    }
}
 
class ContainerClass implements Serializable {
    String name;
    transient AttributeClass feature = new AttributeClass("tall");
 
    ContainerClass(String name, String attribute) {
        this.name = name;
        this.feature = new AttributeClass(attribute);
    }
 
}
 

public class UdemyQuiz34 
{
	public static void main(String[] args) throws Exception {
        File file = new File("ralph.ser");
        ContainerClass ralph = new ContainerClass("Ralph", "short");
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(ralph);
 
        }
 
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream(file))) {
            ralph = (ContainerClass) inputStream.readObject();
        }
 
        System.out.println(ralph.name + " is " + ralph.feature);
    }

}



//Explanation --Correct Answer: When an object is deserialized and it’s class is serializable, it does not get constructed with the class’s constructor. 
//State is restored by reading data from the ObjectInputStream for the individual fields and making assignments to the appropriate fields of the object. 
//The transient field is ignored, and never gets instantiated.





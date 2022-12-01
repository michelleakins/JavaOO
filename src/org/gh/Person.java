//  Think of package as a directory, we can import packages for reuse
package org.gh;

// abstract means we cannot create an object of Person directly
// First we must create a subclass that inherits Person (see Student class)
public abstract class Person{

    //  All people have names (private, see getter/setter)
    private String name;
    // getName
    public String getName(){
        return name;
    }
    // setName
    public void setName(String name){
        this.name = name;
    }

    // This is the constructor to create a new Person
    // Since this can't be done directly (abstract class), you see subclass
    // calls the "super(String)" method (see the Student constructor)
    public Person(String name){
        this.setName(name);
    }

    //  java.lang.Object (superclass of all classes in Java) provides a toString method
    //  This is a method overriding the defult and printing the Person's name
    public String toString(){
        return this.getName();
    }
}

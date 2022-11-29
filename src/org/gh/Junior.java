// Think of package as a directory, we can import packages for reuse
package org.gh;

// Extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// Implements Printable means we must override the methods in that interface
public class Junior extends Student extends Person implements Printable{

    // Attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String juniorGrade;
    
    // Set grade
    public void setGrade(String juniorGrade){
        this.juniorGrade = juniorGrade;
    }
    // Get grade
    public String getGrade(){
        return this.juniorGrade;
    }
    
    // Constructor called to create a new student object
    // See it's usage in RunMe
    public Student(String name, String juniorGrade){
        super(name);
        this.setGrade(juniorGrade);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a junior, I want the name and grade to print
        return "High School Junior details from PrintMe() - " + this.getName()+ " - "+this.getGrade();
    }
}

//  Think of package as a directory, we can import packages for reuse
package org.gh;

// Generic class to contain a main method for testing our structures
public class RunMe{

    // This is the "Start" of your program.  Java always starts at the "main" method
    public static void main(String args[]){
        // Create a new student, set a name and a grade
        // NOTE: since Student inherits from Person we also get person methods
        // see getName() and toString() below which are defined in Person
        System.out.println("Creating a new student and Teacher");
        Junior objStudent = new Junior("Junior Student 1", "GradeA");


        // Print details of a student we created above (name - grade)
        System.out.println("Print with name (from person) and grade (from HS junior student)");
        System.out.println(objStudent.getName() + " - " + objStudent.getGrade());
        

        // This uses the polymorphism to call printMe and see different results
        System.out.println("Print the Student using the printMe method from Printable");
        System.out.println(objStudent.printMe());


        // Use the toString method of Student (not overriden from the Parent definition)
        System.out.println("Use the toString method in person since it's not overridden in the subclasses");
        System.out.println(objStudent);


        // Create a new object and print it 
        // This is to see what it looks like if you do not override the toString method
        Object obj = new Object();
        System.out.println("This will use the Object toString printing the class and memory location");
        System.out.println(obj);
    }
}

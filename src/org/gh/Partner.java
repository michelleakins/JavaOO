//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Teacher the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Partner extends Person implements Printable{

    // attribute to store teacher's class
    private String portfolio;

    // Constructor of tacher taking a name and class as input
    public Partner(String name, String portfolio){
        // Call superclass constructor (in this case Person)
        super (name);

        // Set the class for this teacher
        this.setPortfolio(portfolio);
    }

    // get Class
    public String getPortfolio(){
        return this.portfolio;
    }

    // Set class
    public void setPortfolio(String portfolio){
        this.portfolio = portfolio;
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        return "Partner details from printMe() = " + this.getName()+ " - "+this.getPortfolio();
    }
}

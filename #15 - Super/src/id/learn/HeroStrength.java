package id.learn;

// child class
public class HeroStrength extends Hero{

    // properties
    public String name = "Class Hero Strength";

    // methods
    public void display() {
        System.out.println("this is " + this.name);
        /*
        * this.name will access name if it's exist
        * if not exist then will find another attribute in super class with name 'name'
        *
        * super will always access attribute superclass
        * */
        this.dummy();
    }

    public void displaySuper() {
        // method that test super keyword to know it works if it will directly access attribute on super class
        System.out.println("this is " + super.name);
        super.dummy();
    }

    public void dummy() {
        System.out.println("this is subclass's method");
    }

}

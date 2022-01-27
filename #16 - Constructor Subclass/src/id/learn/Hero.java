package id.learn;

public class Hero {

    // properties
    public String name;
    public double defencePower;

    // constructor
    public Hero(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public Hero(String name) { this.name = name; }

    // method
    public void display() {
        System.out.println("Hero: " + this.name);
    }

}

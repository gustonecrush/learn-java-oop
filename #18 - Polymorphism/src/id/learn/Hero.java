package id.learn;

public class Hero {

    // properties
    public String name;

    // constructor
    public Hero(String name) {
        this.name = name;
    }

    // method
    public void display() {
        System.out.println("\nName : " + this.name);
    }

    public void attack(Hero enemy) {
        System.out.println("Attack!!!");
    }

}

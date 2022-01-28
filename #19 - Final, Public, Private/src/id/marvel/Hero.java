package id.marvel;

public class Hero {

    // properties
    // public: will get access in everywhere
    public String name;
    private double health;

    // constructor
    public Hero(String name, double health) {
        this.name = name;
        this.health = health;

        this.display();
    }

    // getter
    public double getHealth() {
        return this.health;
    }

    // setter
    final void setHealth(double newHealth) {
        this.health = newHealth;
    }

    final void setHealth(String mode) {
        if (mode.equals("reset")){
            this.health = 100;
        }
    }

    // methods
    public void display() {
        System.out.println("Name: " + this.name + " | Health: " + getHealth());
    }

}

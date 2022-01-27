package id.learn;

public class HeroStrength extends Hero{

    // properties
    public static String type = "Strength";

    // constructor
    public HeroStrength(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type  : " + type);
    }

    @Override
    public void takeDamage(double damage) {
        System.out.println("🩸 : " + this.name + " received half damage " + damage + " -> " + damage * 0.5);
        this.health -= damage * 0.5;
    }


}

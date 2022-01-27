package id.learn;

public class HeroIntelligence extends Hero {

    // properties
    public static String type = "Intelligence";

    // constructor
    public HeroIntelligence(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }

    // methods
    @Override
    public void display() {
        super.display();
        System.out.println("Type  : " + HeroIntelligence.type);
    }

    @Override
    public void takeDamage(double damage) {
        System.out.println("🩸 : " + this.name + " received multiple damage " + damage + " -> " + damage * 2.0);
        this.health -= damage * 2.0;
    }


}

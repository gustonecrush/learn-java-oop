package id.learn;

public class HeroStrength extends Hero {

    // properties
    public static String type = "Strength";

    public HeroStrength(String name) {
        super(name);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type : " + type);
    }

}

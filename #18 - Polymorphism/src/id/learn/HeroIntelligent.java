package id.learn;

public class HeroIntelligent extends Hero {

    // properties
    public static String type = "Intelligent";

    public HeroIntelligent(String name) {
        super(name);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type : " + type);
    }

}

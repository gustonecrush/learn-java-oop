package id.learn;

public class HeroSorcerer extends Hero {

    // properties
    public static String type = "Sorcerer";

    public HeroSorcerer(String name) {
        super(name);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type : " + type);
    }

    public void showOff() {
        System.out.println("I am a Sorcerer!");
    }

}

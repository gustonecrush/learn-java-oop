package id.learn;

public class Main {
    public static void main(String[] args) {

	    // inheritance

        Hero hero1 = new Hero();
        hero1.name = "Scarlet Witch";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Black Panther";
        hero2.display();

        HeroIntelligence hero3 = new HeroIntelligence();
        hero3.name = "Iron Man";
        hero3.display();

    }
}

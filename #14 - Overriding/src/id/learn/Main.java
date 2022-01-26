package id.learn;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Scarlet Witch";
        // hero1.defencePower = "no have it";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Black Knight";
        hero2.defencePower = 100;
        hero2.display();

    }

}

package id.learn;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Iron Man", 10, 100);
        HeroStrength hero2 = new HeroStrength("Scarlet Witch", 15, 150);
        HeroIntelligence hero3 = new HeroIntelligence("Shuri", 5, 80);

        hero1.attack(hero2);
        hero2.attack(hero1);
        hero2.attack(hero3);

    }

}

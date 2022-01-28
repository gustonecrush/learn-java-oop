package id.learn;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Scarlet Witch");
        HeroStrength hero2 = new HeroStrength("Hulk");

        // Polymorphic
        Hero hero3 = new HeroIntelligent("Shuri");

        // HeroIntelligent hero4 = new Hero("Mantis"); can not
        HeroSorcerer hero4 = new HeroSorcerer("Doctor Vodoo");
        hero4.showOff();

        // Array List
        Hero[] heroes = new Hero[4]; // akan berlaku casting disini
        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;
        heroes[3] = hero4;

        for(Hero hero: heroes) {
            hero.display();
        }

        // heroes[3].showOff();
        hero1.attack(hero2);
        hero2.attack(hero3);


    }

}

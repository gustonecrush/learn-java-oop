package id.learn;

public class Main {

    public static void main(String[] args) {

        // Super: How we can choose a part from super class's methods or attributes that we don't want to override

        // instantiate object hero1 of Hero
        Hero hero1 = new Hero();

        // instantiate object hero2 of HeroStrength
        HeroStrength hero2 = new HeroStrength();

        // using object methods
        hero1.display();
        hero2.display();
        hero2.displaySuper();

    }

}

package id.learn;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Black Knight",10); // this is using constructor superclass
        hero1.display();

        HeroSorcerer hero2 = new HeroSorcerer("Spiderman");
        hero2.display();

        HeroSorcerer hero3 = new HeroSorcerer("Black Widow");
                hero3.display();

    }

}

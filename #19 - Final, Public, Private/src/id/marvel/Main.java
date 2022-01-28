package id.marvel;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("ucup", 100);
        HeroIntel hero2 = new HeroIntel("lina geboy", 100);

        hero1.setHealth(120);
        hero2.setHealth(80);

        hero1.display();
        hero2.display();

        hero1.setHealth("reset");
        hero1.display();

    }

}

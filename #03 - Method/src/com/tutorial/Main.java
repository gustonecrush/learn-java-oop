package com.tutorial;

class Hero {

    // property
    String name;
    String power;

    // constructor
    Hero(String name, String power) {
        this.name = name;
        this.power = power;

        this.lookHero();
    }

    // method without return and parameter
    void lookHero() {
        System.out.println(this.name + " | " + this.power);
    }

    // method without return but with parameter
    void setName(String name) {
        this.name = name;
    }

    // method with return but without parameter
    String getName() {
        return this.name;
    }

    String getPower() {
        return this.power;
    }

    // method with return and parameter
    String sendMessage(String message) {
        return this.name + ": " + message;
    }

}

class Villain {

    // property
    String name;
    String power;

    Villain(String name, String power) {
        this.name = name;
        this.power = power;
    }


}

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Scarlet Witch", "Chaos Magic");
        hero1.setName("Lore");
        hero1.lookHero();

        System.out.println(hero1.getName() + " | " + hero1.getPower());

        String message = hero1.sendMessage("You are so good!");
        System.out.println(message);

        Villain villain1 = new Villain("Thanos", "Ininity Gauntlet");

    }
}

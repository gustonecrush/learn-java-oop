package com.tutorial;

// class without constructor
class Hero {
    String name;
    int health;
}

// class with constuctor
class Comic {

    String title;
    String author;

    // constructor -> will invoke when instantiate an object
//    Comic() {
//        System.out.println("this is constructor");
//    }

    // constructor with parameter
    Comic(String inputTitle, String inputAuthor) {
        title = inputTitle;
        author = inputAuthor;

        System.out.println(title + " | " + author);
    }

}

public class Main {
    public static void main(String[] args) {

//        Hero hero1 = new Hero();
//        hero1.name = "Scarlet Witch";
//        hero1.health = 200;

//        System.out.println(hero1.name);
//        System.out.println(hero1.health);

        Comic comic1 = new Comic("House of M", "Jake Kirby");
        Comic comic2 = new Comic("Trial of Magneto", "Jake Kirby");

    }
}

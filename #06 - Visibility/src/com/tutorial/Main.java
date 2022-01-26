package com.tutorial;

class Player {

    String name; // default
    public int exp; // public
    private int health; // private

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Exp : " + this.exp);
        System.out.println("Health: " + this.health);

        expUp();
    }

    public void editName(String newName) {
        this.name = newName;
    }

    private void expUp() {
        this.exp += 10;
    }

}

public class Main {
    public static void main(String[] args) {

        // default
        Player player1 = new Player("Scarlet Witch", 0, 100);
        player1.name = "Spider-Man";
        System.out.println(player1.name);

        // public
        player1.exp = 100;
        System.out.println(player1.exp);

        // private
//        player1.health = 200;
//        System.out.println(player1.health);

        // default + public

        player1.display();
        player1.editName("Captain America");

        player1.display();

        // private
//        player1.addExp();

    }
}

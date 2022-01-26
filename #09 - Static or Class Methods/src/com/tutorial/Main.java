package com.tutorial;
import java.util.ArrayList;

class Player {
    private String name;
    private static int numberOfPlayer;
    private static ArrayList<String> playerListName = new ArrayList<String>();

    public Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.playerListName.add(this.name);
    }

    public void display() {
        System.out.println("Player: " + getName());
    }

    private String getName() { return this.name; }

    public static void getNumberOfPlayer() {
        System.out.println("Number of Player: " + Player.numberOfPlayer);
    }

    public static ArrayList<String> getNameOfPlayer() {
        return Player.playerListName;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Scarlet Witch");
        Player player2 = new Player("Black Knight");
        Player player3 = new Player("Wolvrine");
        Player player4 = new Player("Punisher");

        player1.display();
//        player2.display();
//        player3.display();

        Player.getNumberOfPlayer();
        player1.getNumberOfPlayer();
        System.out.println("Players: " + Player.getNameOfPlayer());
    }
}

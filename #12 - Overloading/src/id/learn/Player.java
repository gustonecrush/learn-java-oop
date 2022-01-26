package id.learn;

public class Player {
    private String name;
    private static int nPlayer;

    // overloading constructor
    // option 1 :
    public Player(String name) {
        Player.nPlayer++;
        this.name = name;
    }

    // option 2 :
    public Player() {
        Player.nPlayer++;
        this.name = "player" + Player.nPlayer;

    }

    public void display() {
        System.out.println("Name: " + this.name);
    }
}

package id.learn;
import id.learn.Player;
import id.learn.Math;

public class Main {
    public static void main(String[] args) {
        // overloading on constructor

        Player player1 = new Player("Iron Man");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Black Knight");

        player1.display();
        player2.display();
        player3.display();
        player4.display();

        // overloading on methods
        System.out.println(Math.add(10, 30));
        System.out.println(Math.add(10.3,9));
        System.out.println(Math.add(10, 3.4));

        Math math1 = new Math();
        math1.display();

    }
}

package com.company;

// will import Class
import com.terminal.Console;
import com.terminal.Terminal;

// will import static method from Class
import static com.terminal.Console.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("lina");
        player1.display();

        Console.log(player1.getName());
        Terminal.log(player1.getName());

        log(player1.getName());
        test();
    }
}

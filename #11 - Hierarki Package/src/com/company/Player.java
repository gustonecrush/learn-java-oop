package com.company;
import com.terminal.Console;

// visibility default
class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void display() {
        Console.log("Using console: ");
        Console.log("Player: " + this.name);
    }

    public String getName() { return this.name; }
}

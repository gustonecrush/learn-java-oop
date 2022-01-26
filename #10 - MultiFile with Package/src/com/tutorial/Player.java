package com.tutorial;

public class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) { this.name = name; }
    public void show() {
        System.out.println("Player: " + this.name);
    }
}
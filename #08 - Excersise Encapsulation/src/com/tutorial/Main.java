package com.tutorial;

class Player {
    private String name;
    private int baseHealth;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int baseAttack;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName() { return this.name; }
    public int getHealth() { return this.maxHealth() - this.totalDamage; }

    public void display() {
        System.out.println("Player\t: " + this.name);
        System.out.println("Level\t: " + this.level);
        System.out.println("Health\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t: " + this.getAttack());
        System.out.println("Status\t: " + this.isAlive);
        this.armor.getArmor();
        System.out.println("\n");
    }

    public void attack(Player enemy) {
        // hitung damage yg diberikan
        int damage = this.getAttack();
        // print event
        System.out.println("Player\t: " + this.name + " is attacking with " + damage + " damage to " + enemy.getName());
        // attacks enemy
        enemy.defence(damage);
        this.levelUp();
    }

    public void defence(int damage) {
        // receive damage
        int defencePower = this.armor.getDefencePower();
        System.out.println(this.name + " defence power: " + defencePower);
        int deltaDamage = (damage > defencePower) ? (damage - defencePower) : 0;

        // adding total damage
        System.out.println("damage earned: " + deltaDamage);
        this.totalDamage += deltaDamage;

        // check isAlive
        if(this.getAttack() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }


    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth * this.armor.getAddHealth() * 10;
    }

    public void levelUp() {
        this.level++;
    }

    private int getAttack() {
        return this.baseAttack + this.level * incrementAttack + this.weapon.getAttack();
    }


}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public void getArmor() {
        System.out.println("Armor\t: " + this.name + " | " + this.strength);
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDefencePower() { return this.strength * 2; }

    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }
}

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Scarlet Witch");
        Armor armor1 = new Armor("Darkhold Dress", 5, 100);
        Weapon weapon1 = new Weapon("Darkhold", 10);

        Player player2 = new Player("Wolverine");
        Armor armor2 = new Armor("Adamantium Fingers", 3, 100);
        Weapon weapon2 = new Weapon("Adamantium", 10);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.display();

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);

        player2.display();


    }
}

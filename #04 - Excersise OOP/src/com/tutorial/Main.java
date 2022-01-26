package com.tutorial;

// player
class Player {

    // player properties
    String name;
    float health;
    byte level;

    // Object member
    Weapon weapon;
    Armor armor;

    Player(String name, float health) {
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("Name  : " + this.name);
        System.out.println("Health: " + this.health);
        this.weapon.display();
        this.armor.display();
        System.out.println("\n");
    }

    void attack(Player enemy) {
        float attackPower = weapon.attackPower;
        enemy.defense(attackPower);

        System.out.println(this.name + " attacking " + enemy.name + " with power " + attackPower);
    }

    void defense(float attackPower) {
        float damage;
        // will took damage
        // if attackpower > defense power, substrac
        if( this.armor.defensePower < attackPower ) {
            damage = attackPower - this.armor.defensePower;
        } else {
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }


}

// weapon
class Weapon {

    // weapon properties
    float attackPower;
    String name;

    Weapon(String name, float attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon: " + this.name + " | " + this.attackPower);
    }

}

// armor
class Armor {

    // armor properties
    float defensePower;
    String name;

    Armor(String name, float defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + " | " + this.defensePower);
    }

}

public class Main {
    public static void main(String[] args) {

        // instantiate player
        Player player1 = new Player("Black Knight", 100);

        // instantiate weapon
        Weapon weapon1 = new Weapon("Ebony Blade", 50);

        // instantiate armor
        Armor armor1 = new Armor("Zirah Knight", 50);

        // equip weapon & armor for player1
        player1.equipWeapon(weapon1);
        player1.equipArmor(armor1);

        player1.display();

        Player player2 = new Player("Scarlet Witch", 100);
        Weapon weapon2 = new Weapon("Chaos Magic", 75);
        Armor armor2 = new Armor("Dark Hold Armor", 50);

        player2.equipWeapon(weapon2);
        player2.equipArmor(armor2);
        player2.display();

        System.out.println("========== WAR 1 ==========");
        player1.attack(player2);

        System.out.println("========== WAR 2 ==========");
        player2.attack(player1);

        System.out.println("\n");
        player1.display();
        player2.display();


    }
}

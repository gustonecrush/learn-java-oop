package id.learn;

public class Hero {

    // properties
    public String name;
    public double attackPower, health;

    // constructor
    public Hero(String nameInput, double attackInput, double healthInput) {
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    // getters

    // methods
    public void display() {
        System.out.println("Name  : " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power : " + this.attackPower);
    }

    public void takeDamage(double damage) {
        System.out.println("🩸 : " + this.name + " received damage " + damage);
        this.health -= damage;
    }

    public void attack(Hero enemy) {
        System.out.println("\n========== WAR ==========");
        System.out.println("⚔️ : " + this.name + " attacks " + enemy.name);

        enemy.takeDamage(this.attackPower);

        System.out.print("\n========== STATUS ==========\n");
        this.display();
        enemy.display();
    }

}

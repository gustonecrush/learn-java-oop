package id.marvel;

public class HeroIntel extends Hero{

    public HeroIntel(String name, double health) {
        super(name, health);
    }

//    override getHealth( )
//    public double getHealth() {
//        return this.health -> tidak dapat diakses
//        return super.getHealth();
//    }

    // setter
//    @Override
//    final void setHealth(double newHealth) {
//        System.out.println(newHealth);
//    }

    // methods
    // visibility has to be same like super class
    public void display() {
        System.out.println("Name: " + this.name + " | Health: " + getHealth());
    }

}

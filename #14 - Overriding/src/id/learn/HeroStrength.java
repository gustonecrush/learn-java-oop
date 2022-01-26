package id.learn;

// subclass
public class HeroStrength extends Hero{
    double defencePower;

    // overriding methods
    public void display() {
        System.out.println("Hero Strength");
        System.out.println("Hero's Name: " + this.name);
        System.out.println("Defence Power: " + this.defencePower  );
    }
}

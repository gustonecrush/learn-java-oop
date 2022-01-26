package com.tutorial;

class Data {

    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
        this.doublePrivate = 0;
    }

    public void display() {
        System.out.println(this.intPrivate);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }

}

class Circle {

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    // setter
    public void setRadius(double radius) {
        this.diameter = radius * 2;
    }

    // getter
    public double getRadius() {
        return this.diameter/2;
    }

    // getter complex
    public double getArea() {
        return 3.14*diameter*diameter/4;
    }

}

public class Main {
    public static void main(String[] args) {

        Data data1 = new Data();

        // public
        data1.intPublic = 20; // read
        System.out.println(data1.intPublic); // write

        // read only ( using GETTER )
        int number = data1.getIntPrivate();
        System.out.println("getter: " + number);

        // write only ( using SETTER )
        data1.setDoublePrivate(101);

        data1.display();

        // read & write with setter and getter
        Circle data2 = new Circle(10);
        System.out.println(data2.getRadius());
        data2.setRadius(14);
        System.out.println(data2.getRadius());

        System.out.println(data2.getArea());


    }
}

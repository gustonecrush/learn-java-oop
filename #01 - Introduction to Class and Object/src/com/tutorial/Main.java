package com.tutorial;

// create class as template
class Student {
    String name;
    String student_id;
    String major;
    double GPA;
    int age;
}

public class Main {
    public static void main(String[] args) {

        // instantiate -> create an object
        Student student1 = new Student();
        student1.name = "Farhan";
        student1.student_id = "SI102";
        student1.major = "Information System";
        student1.GPA = 4.0;
        student1.age = 20;

        System.out.println(student1.name);
        System.out.println(student1.student_id);
        System.out.println(student1.major);
        System.out.println(student1.GPA);
        System.out.println(student1.age);

        Student student2 = new Student();
        student2.name = "Gian";
        student2.student_id = "TI103";
        student2.major = "Informatic Enggineering";
        student2.GPA = 4.0;
        student2.age = 20;

        System.out.println(student2.name);
        System.out.println(student2.student_id);
        System.out.println(student2.major);
        System.out.println(student2.GPA);
        System.out.println(student2.age);

    }
}

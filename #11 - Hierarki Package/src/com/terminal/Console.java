package com.terminal;

// visibility for all package
public class Console {
    public static void log(String message) {
        System.out.println(message);
    }

    public static void test() {
        System.out.println("this is test");
    }
}

// only can access from this package
//class Terminal {
//    public static void log(String message) {
//        System.out.println(message);
//    }
//}
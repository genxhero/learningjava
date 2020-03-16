package com.company;

public class Greeter {
    public static void sayName (String name) {
        String greeting = String.format("Hello, %s", name);
        System.out.println(greeting);
    }
}

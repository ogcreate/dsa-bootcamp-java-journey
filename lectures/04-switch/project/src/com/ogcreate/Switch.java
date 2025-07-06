package com.ogcreate;

public class Switch {

    public static void main(String[] args) {
        System.out.println("x");
        System.out.println("asdad");

        String fruit = "mangxo";

        switch (fruit.toLowerCase()) {
            case "apple" -> System.out.println("apple");
            case "Orange" -> System.out.println("orange");
            case "mango" -> System.out.println(fruit);
            default -> System.out.println("error");
        }
    }
    
}
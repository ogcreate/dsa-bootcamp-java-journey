package com.ogcreate;

import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your formal education status(College, High School, or Grade School)");
        String education = in.nextLine();
        boolean flag = true;

        switch (education.toLowerCase()) {
            case "college" -> {
                while (flag) {

                    System.out.println("what course do u want? (IT) {CS} /CE/");
                    String course = in.nextLine();
                    switch (course.toLowerCase()) {
                        case "it" -> {
                            System.out.println("goodluck with");
                            flag = false;
                        }
                        case "cs" -> {
                            System.out.println("goodluck with thata");
                            flag = false;
                        }
                        case "ce" -> {
                            System.out.println("goodluck with thata");
                            flag = false;
                        }
                        default -> System.out.println("no answer like that");
                    }

                }
            }
            case "grade school" -> System.out.println("okay!");
            case "high school" -> System.out.println("okay!");
            default -> System.out.println("error, not found!");
        }
    }
}

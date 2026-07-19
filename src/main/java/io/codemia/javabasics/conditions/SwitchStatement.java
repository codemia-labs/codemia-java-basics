package io.codemia.javabasics.conditions;

public class SwitchStatement {

    public static void run() {

        System.out.println("=== Switch ===");

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Lundi");
                break;

            case 2:
                System.out.println("Mardi");
                break;

            case 3:
                System.out.println("Mercredi");
                break;

            default:
                System.out.println("Jour inconnu");

        }

        System.out.println();

    }

}
package io.codemia.javabasics.tableaux;

public class ArrayModification {

    public static void run() {

        System.out.println("=== Array modification ===");

        String[] names = {
                "Alice",
                "Bob",
                "Charlie"
        };


        System.out.println("Before modification : " + names[1]);

        names[1] = "David";

        System.out.println("After modification : " + names[1]);

        System.out.println();

    }

}
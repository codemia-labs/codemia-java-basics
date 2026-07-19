package io.codemia.javabasics.boucles;

public class DoWhileLoop {

    public static void run() {

        System.out.println("=== Boucle do while ===");

        int counter = 1;

        do {
            System.out.println("Compteur : " + counter);
            counter++;
        } while (counter <= 5);

        System.out.println();

    }

}
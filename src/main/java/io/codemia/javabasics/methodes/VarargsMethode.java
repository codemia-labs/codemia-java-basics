package io.codemia.javabasics.methodes;

public class VarargsMethode {

    public static void run() {

        System.out.println("=== Paramètres variables ===");

        afficherNombres(1, 2, 3, 4, 5);

        System.out.println();

    }


    public static void afficherNombres(int... nombres) {

        for (int nombre : nombres) {

            System.out.println(nombre);

        }

    }

}
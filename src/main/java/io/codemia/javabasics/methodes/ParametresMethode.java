package io.codemia.javabasics.methodes;

public class ParametresMethode {

    public static void run() {

        System.out.println("=== Paramètres d'une méthode ===");

        afficherBonjour("Alice");

        additionner(10, 5);

        System.out.println();

    }

    public static void afficherBonjour(String nom) {

        System.out.println("Bonjour " + nom);

    }


    public static void additionner(int a, int b) {

        System.out.println("Résultat : " + (a + b));

    }

}
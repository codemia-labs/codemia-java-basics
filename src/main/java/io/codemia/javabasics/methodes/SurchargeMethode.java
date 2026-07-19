package io.codemia.javabasics.methodes;

public class SurchargeMethode {

    public static void run() {

        System.out.println("=== Surcharge de méthodes ===");

        afficher(10);

        afficher("Java");

        afficher("Codemia", 2026);

        System.out.println();

    }


    public static void afficher(int nombre) {

        System.out.println("Nombre : " + nombre);

    }


    public static void afficher(String texte) {

        System.out.println("Texte : " + texte);

    }


    public static void afficher(String texte, int annee) {

        System.out.println(texte + " - " + annee);

    }

}
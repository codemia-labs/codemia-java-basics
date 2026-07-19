package io.codemia.javabasics.methodes;

public class ValeurRetour {

    public static void run() {

        System.out.println("=== Valeur de retour ===");

        int resultat = additionner(10, 20);

        System.out.println("Résultat : " + resultat);

        System.out.println();

    }

    public static int additionner(int a, int b) {

        return a + b;

    }

}
package io.codemia.javabasics.conditions;

public class NestedConditions {

    public static void run() {

        System.out.println("=== Conditions imbriquées ===");

        boolean isLogged = true;
        boolean isAdmin = true;

        if (isLogged) {

            System.out.println("Utilisateur connecté.");

            if (isAdmin) {
                System.out.println("Accès administrateur autorisé.");
            }

        }

        System.out.println();

    }

}
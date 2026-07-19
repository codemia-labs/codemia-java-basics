package io.codemia.javabasics.operateurs;

public class TernaryOperator {

    public static void run() {

        System.out.println("=== Opérateur ternaire ===");

        int age = 18;

        String status = age >= 18 ? "Majeur" : "Mineur";

        System.out.println(status);

        System.out.println();

    }

}
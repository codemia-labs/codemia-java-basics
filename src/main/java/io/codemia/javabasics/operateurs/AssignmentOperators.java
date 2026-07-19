package io.codemia.javabasics.operateurs;

public class AssignmentOperators {

    public static void run() {

        System.out.println("=== Opérateurs d'affectation ===");

        int score = 10;

        score += 5;
        System.out.println("Après += : " + score);

        score -= 3;
        System.out.println("Après -= : " + score);

        score *= 2;
        System.out.println("Après *= : " + score);

        score /= 4;
        System.out.println("Après /= : " + score);

        System.out.println();

    }

}
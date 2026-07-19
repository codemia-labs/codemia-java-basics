package io.codemia.javabasics.conditions;

public class ElseIfStatement {

    public static void run() {

        System.out.println("=== Condition if / else if / else ===");

        int score = 85;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Bien");
        } else if (score >= 50) {
            System.out.println("Moyen");
        } else {
            System.out.println("Insuffisant");
        }

        System.out.println();

    }

}
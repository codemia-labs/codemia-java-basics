package io.codemia.javabasics.boucles;

public class BreakStatement {

    public static void run() {

        System.out.println("=== Instruction break ===");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println();

    }

}
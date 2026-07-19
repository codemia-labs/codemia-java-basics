package io.codemia.javabasics.boucles;

public class ContinueStatement {

    public static void run() {

        System.out.println("=== Instruction continue ===");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println();

    }

}
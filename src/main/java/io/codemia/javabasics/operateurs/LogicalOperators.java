package io.codemia.javabasics.operateurs;


public class LogicalOperators {

    public static void run() {

        System.out.println("=== Opérateurs logiques ===");

        boolean isAdult = true;
        boolean hasTicket = false;

        System.out.println("AND : " + (isAdult && hasTicket));
        System.out.println("OR : " + (isAdult || hasTicket));
        System.out.println("NOT : " + (!isAdult));

        System.out.println();

    }

}